import java.util.List;


public class PeopleAction extends ActionSupport implements ModelDriven<People>{
	private static final long serialVersionUID = 1L;
	private People people =new People();
	public People getModel() {
		return people;
	}
	private int page;//接收当前页
	public void setPage(int page) {
		this.page = page;
	}
	//注入操作数据库的peopleDao
	private PeopleDao peopleDao;
	public void setPeopleDao(PeopleDao peopleDao) {
		this.peopleDao = peopleDao;
	}
	
	/**
	 * 通过Ajax查询数据库
	 */
	public String findByPhone(){
	    People peopleByPhone=peopleDao.findByPhone(people.getPhone());
		if(peopleByPhone!=null){
			this.addActionMessage("已经存在该号码！");
			return "msg";
		}else{
			this.addActionMessage("该手机尚未注册！");
		}
		return "msg";
	}
	
	
	/**
	 * 修改People信息
	 */
	public String updatePeople(){
		System.out.println("地址:"+people.getAddress());
		peopleDao.updatePeople(people);
		return "index";
	}
	
	/**
	 * 跳转到需要修改的页面并根据pid查询出那条数据
	 */
	public String toUpdatePeople(){
		People singlePeople =peopleDao.findByPid(people.getPid());
		ServletActionContext.getRequest().getSession().setAttribute("singlePeople", singlePeople);
		return "toUpdate";
	}
	
	
	/**
	 * 删除一条数据
	 */
	public String deletePeople(){
		peopleDao.deletePeple(people.getPid());
		return "index";
	}
	
	/**
	 * 把信息插入数据库
	 */
	public String insertPeople(){
		if(people!=null){
			peopleDao.save(people);
		}
		this.addActionMessage("数据插入成功！");
		return "index";
	}
	
	/**
	 * 首页中查询前十条数据
	 */
	public String execute(){
		List<People> peopleListTen =peopleDao.findAll();
		
		for(People p:peopleListTen){
			int c=1;
			System.out.println(c+":"+p.getPhone()+p.getEmail());
			c++;
			System.out.println(c);
		}
		ActionContext.getContext().getValueStack().set("plistTen", peopleListTen);
		return "index";
	}

	/**
	 * 跳转到所有信息的页面
	 */
	public String findOnePage(){
		PageBean<People> pageBean= findByPage(page);
		ActionContext.getContext().getValueStack().set("pageBean",pageBean);
		return "findOnePage";
	}
	//通过当前页查询当页的数据
	public PageBean<People> findByPage(int page) {
		PageBean<People> pageBean =new PageBean<People>();
		pageBean.setPage(page);//设置当前页，这里页面传过来为1；
		int pageSize=5;//每页先试试5条数据
		pageBean.setPageSize(pageSize);
		int totalCount=0;
		totalCount=peopleDao.findTotalCount();
		pageBean.setTotalCount(totalCount);//存入数据库总的条数
		int totalPage=0;
		if(totalCount%pageSize==0){
			totalPage=totalCount/pageSize;
		}else{
			totalPage=totalCount/pageSize+1;
		}
		pageBean.setTotalPage(totalPage);//将总的页码存入pageBean
		System.out.println("111111111"+totalPage);
		
		int begin =(page-1)*pageSize;
		List<People> list=peopleDao.findByPageCid(begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}
	
	
	
	
	
	
}
