package com.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.service.GoodsService;
import com.vo.Goods;

@Controller
public class UploadGoodsController {
	@Autowired
	private  GoodsService goodsService;
	
	
	@RequestMapping("toUploadImage.do")
	public String toUploadImage(){//��ת��ͼƬ�ϴ�ҳ��
		return "toUploadImage";
	}

	/**
	 * 
	 * @param file
	 * @param req
	 * @param goodsDescription
	 * @return
	 * 1.���Ȱ�Goods�������Ϣ�������
	 * 2.��ͼƬ�������goods_image��
	 * 3.��ͼƬ����ڷ�����/img/goods_imgĿ¼��
	 */
	@RequestMapping("/uploadGoodsImage.do")
	public String batch(@RequestParam("file") CommonsMultipartFile file[],
			HttpServletRequest req,Goods goods){
		//����һ��������������ļ���
		List<String> batchFileName=new ArrayList<String>();
		
		System.out.println(goods.getGoods_description());
		//��ȡ�ϴ�λ��
		String path=req.getRealPath("/img/goods_img");
		for(int i=0;i<file.length;i++){
			//��ȡ�ļ���
			String filename=file[i].getOriginalFilename();
			batchFileName.add(filename);
//			System.out.println(filename);
			try {
				InputStream is = file[i].getInputStream();
				OutputStream os = new FileOutputStream(new File(path,filename));
				int len=0;
				byte[] buffer = new byte[400];
				while((len=is.read(buffer))!=-1){
					os.write(buffer, 0, len);
				}
				os.close();
				is.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/**
		 * ��batchFileName���ļ������������ݿ�
		 */
		goodsService.uploadGoods(goods,batchFileName);
		
		return "uploadImageSuccess";
	}
	
	
	
	

}
