package Free;

import com.opensymphony.xwork2.ActionSupport;
/**
 * dsad
 * @author 35209
 *
 */
public class ChinaAndInternational extends ActionSupport{
	private String place;  	//目的地
	private double LuggageWeight;	//行李重量
	private int   Luggageamount;	//行李数量
	private double Length;	//行李长度	
	private double Width;	//行李宽度
	private double Height;	//行李高度
	private String Carbin;	//仓位类型
	public int getLuggageamount() {
		return Luggageamount;
	}
	public void setLuggageamount(int luggageamount) {
		if(luggageamount>=0)
		Luggageamount = luggageamount;
		else {
			System.out.println("行李数量输入错误");
		}
	}
	public String getCarbin() {
		return Carbin;
	}
	public void setCarbin(String carbin) {
		
		Carbin = carbin;
		
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		
		this.place = place;
		
	}
	
	public double getLuggageWeight() {
		return LuggageWeight;
	}
	public void setLuggageWeight(double luggageWeight) {
		if(luggageWeight>=0)
		LuggageWeight = luggageWeight;
		else {
			System.out.println("行李重量输入错误");
		}
	}
	public double getLength() {
		return Length;
	}
	public void setLength(double length) {
		if(length>=0)
		Length = length;
		else {
			System.out.println("行李长度输入错误");
		}
	}
	public double getWidth() {
		return Width;
	}
	public void setWidth(double width) {
		if(width>=0)
			Width = width;
			else {
				System.out.println("行李宽度输入错误");
			}
		
	}
	public double getHeight() {
		return Height;
	}
	public void setHeight(double height) {
		if(height>=0)
			Height = height;
			else {
				System.out.println("行李高度输入错误");
			}
		
	}
	public String Compute3() {
		System.out.println(place);
		if(place.equals("国内")) {
			if(Carbin.equals("头等舱")&&LuggageWeight<=40) {
				return SUCCESS;}

			
			if(Carbin.equals("公务舱")&&LuggageWeight<=30) {
				return SUCCESS;}
		
			
			if(Carbin.equals("经济舱")&&LuggageWeight<=20) {
				return SUCCESS;}
			
			if(Carbin.equals("儿童")&&LuggageWeight<=100)
				return SUCCESS;
		}
		if(place.equals("区域一")) {
			if(Carbin.equals("头等舱")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3) {
				return SUCCESS;}
			
			if(Carbin.equals("公务舱")&&LuggageWeight<=64&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("经济舱")&&LuggageWeight<=46&&Length+Width+Height<=158&&Luggageamount<=2) {
					return SUCCESS;}
			if(Carbin.equals("儿童")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("区域二")) {
			if(Carbin.equals("头等舱")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("公务舱")&&LuggageWeight<=64&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("经济舱")&&LuggageWeight<=32&&Length+Width+Height<=158&&Luggageamount<=1)
					return SUCCESS;
			if(Carbin.equals("儿童")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("区域三")) {
			if(Carbin.equals("头等舱")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("公务舱")&&LuggageWeight<=69&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("经济舱")&&LuggageWeight<=23&&Length+Width+Height<=158&&Luggageamount<=2)
					return SUCCESS;
			if(Carbin.equals("儿童")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("区域四")) {
			if(Carbin.equals("头等舱")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("公务舱")&&LuggageWeight<=64&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("明珠经济舱")&&LuggageWeight<=46&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("经济舱")&&LuggageWeight<=23&&Length+Width+Height<=158&&Luggageamount<=1)
					return SUCCESS;
			if(Carbin.equals("儿童")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("韩国")) {
			if(Carbin.equals("头等舱")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("公务舱")&&LuggageWeight<=64&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("经济舱")&&LuggageWeight<=23&&Length+Width+Height<=158&&Luggageamount<=1)
					return SUCCESS;
			if(Carbin.equals("儿童")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("特别旅客")) {
			if(Carbin.equals("南航明珠金卡会员")||Carbin.equals("天合联盟超级精英")&&LuggageWeight<=116&&Length+Width+Height<=158&&Luggageamount<=4)
				return SUCCESS;
			if(Carbin.equals("南航明珠银卡会员")||Carbin.equals("天合联盟精英")&&LuggageWeight<=74&&Length+Width+Height<=158&&Luggageamount<=4)
				return SUCCESS;
			if(Carbin.equals("留学生")||Carbin.equals("劳务")||Carbin.equals("海员")&&LuggageWeight<=23&&Length+Width+Height<=158&&Luggageamount<=3)
					return SUCCESS;
			
		}
			
		return ERROR;
	}
	public String Compute(String place,double LuggageWeight,int Luggageamount,double Length,double Width,double Height,String Carbin) {
		if(place.equals("国内")) {
			if(Carbin.equals("头等舱")&&LuggageWeight<=40)
				return SUCCESS;
			if(Carbin.equals("公务舱")&&LuggageWeight<=30)
				return SUCCESS;
			if(Carbin.equals("经济舱")&&LuggageWeight<=20)
				return SUCCESS;
			if(Carbin.equals("儿童")&&LuggageWeight<=100)
				return SUCCESS;
		}
		if(place.equals("区域一")) {
			if(Carbin.equals("头等舱")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("公务舱")&&LuggageWeight<=64&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("经济舱")&&LuggageWeight<=46&&Length+Width+Height<=158&&Luggageamount<=2)
					return SUCCESS;
			if(Carbin.equals("儿童")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("区域二")) {
			if(Carbin.equals("头等舱")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("公务舱")&&LuggageWeight<=64&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("经济舱")&&LuggageWeight<=32&&Length+Width+Height<=158&&Luggageamount<=1)
					return SUCCESS;
			if(Carbin.equals("儿童")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("区域三")) {
			if(Carbin.equals("头等舱")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("公务舱")&&LuggageWeight<=69&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("经济舱")&&LuggageWeight<=23&&Length+Width+Height<=158&&Luggageamount<=2)
					return SUCCESS;
			if(Carbin.equals("儿童")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("区域四")) {
			if(Carbin.equals("头等舱")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("公务舱")&&LuggageWeight<=64&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("明珠经济舱")&&LuggageWeight<=46&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("经济舱")&&LuggageWeight<=23&&Length+Width+Height<=158&&Luggageamount<=1)
					return SUCCESS;
			if(Carbin.equals("儿童")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("韩国")) {
			if(Carbin.equals("头等舱")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("公务舱")&&LuggageWeight<=64&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("经济舱")&&LuggageWeight<=23&&Length+Width+Height<=158&&Luggageamount<=1)
					return SUCCESS;
			if(Carbin.equals("儿童")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("特别旅客")) {
			if(Carbin.equals("南航明珠金卡会员")||Carbin.equals("天合联盟超级精英")&&LuggageWeight<=116&&Length+Width+Height<=158&&Luggageamount<=4)
				return SUCCESS;
			if(Carbin.equals("南航明珠银卡会员")||Carbin.equals("天合联盟精英")&&LuggageWeight<=74&&Length+Width+Height<=158&&Luggageamount<=4)
				return SUCCESS;
			if(Carbin.equals("留学生")||Carbin.equals("劳务")||Carbin.equals("海员")&&LuggageWeight<=23&&Length+Width+Height<=158&&Luggageamount<=3)
					return SUCCESS;
			
		}
			
		return ERROR;
	}
	

}
