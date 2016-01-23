package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.Test;

import com.yk.player.test.dto.ElementDto;
import com.yk.player.test.findelement.FindElement;

public class NewTest {
	/*public static void main(String[] args) throws InterruptedException{
		String beginTestTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println("-----------yk player UI test begin----------");
		System.out.println("��ʼ����ʱ��Ϊ ��" + beginTestTime + "!");
		testGoogleSearch();
	}*/
    @Test
	public static void testGoogleSearch() throws InterruptedException {	  
	  	 
	   String beginTestTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
	   System.out.println("-----------yk player UI test begin----------");
	   System.out.println("开始测试时间：" + beginTestTime + "!");
		
	  FindElement element=new FindElement();			  
	  ElementDto elementDto = element.findElement();
	  
	  
	  elementDto.getPlay().click();
	  Thread.sleep(100000); 
	  
	  elementDto.getPause().click();
	  Thread.sleep(3000);
	  
	  elementDto.getPlay().click();	  
	  elementDto.getSeek().sendKeys("168");
	  Thread.sleep(3000);
	  	  
	  elementDto.getSeekto().click();
	  Thread.sleep(3000);
	  	  
	  elementDto.getCurrentTime().click();
	  Thread.sleep(3000);
	 	  
	  String time = "";
	  time = elementDto.getShowCurrentTime().getAttribute("value");
	  System.out.println("当前时间:"+time+"s!");
	  
	  System.out.println("---------yk player UI test finish----------");
	  String finishTestTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
	  System.out.println("结束测试时间：" + finishTestTime + "!");
	  
	  
	  
	  
	  
	}
}
