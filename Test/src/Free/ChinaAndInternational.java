package Free;

import com.opensymphony.xwork2.ActionSupport;
/**
 * dsad
 * @author 35209
 *
 */
public class ChinaAndInternational extends ActionSupport{
	private String place;  	//Ŀ�ĵ�
	private double LuggageWeight;	//��������
	private int   Luggageamount;	//��������
	private double Length;	//�����	
	private double Width;	//������
	private double Height;	//����߶�
	private String Carbin;	//��λ����
	public int getLuggageamount() {
		return Luggageamount;
	}
	public void setLuggageamount(int luggageamount) {
		if(luggageamount>=0)
		Luggageamount = luggageamount;
		else {
			System.out.println("���������������");
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
			System.out.println("���������������");
		}
	}
	public double getLength() {
		return Length;
	}
	public void setLength(double length) {
		if(length>=0)
		Length = length;
		else {
			System.out.println("������������");
		}
	}
	public double getWidth() {
		return Width;
	}
	public void setWidth(double width) {
		if(width>=0)
			Width = width;
			else {
				System.out.println("�������������");
			}
		
	}
	public double getHeight() {
		return Height;
	}
	public void setHeight(double height) {
		if(height>=0)
			Height = height;
			else {
				System.out.println("����߶��������");
			}
		
	}
	public String Compute3() {
		System.out.println(place);
		if(place.equals("����")) {
			if(Carbin.equals("ͷ�Ȳ�")&&LuggageWeight<=40) {
				return SUCCESS;}

			
			if(Carbin.equals("�����")&&LuggageWeight<=30) {
				return SUCCESS;}
		
			
			if(Carbin.equals("���ò�")&&LuggageWeight<=20) {
				return SUCCESS;}
			
			if(Carbin.equals("��ͯ")&&LuggageWeight<=100)
				return SUCCESS;
		}
		if(place.equals("����һ")) {
			if(Carbin.equals("ͷ�Ȳ�")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3) {
				return SUCCESS;}
			
			if(Carbin.equals("�����")&&LuggageWeight<=64&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("���ò�")&&LuggageWeight<=46&&Length+Width+Height<=158&&Luggageamount<=2) {
					return SUCCESS;}
			if(Carbin.equals("��ͯ")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("�����")) {
			if(Carbin.equals("ͷ�Ȳ�")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("�����")&&LuggageWeight<=64&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("���ò�")&&LuggageWeight<=32&&Length+Width+Height<=158&&Luggageamount<=1)
					return SUCCESS;
			if(Carbin.equals("��ͯ")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("������")) {
			if(Carbin.equals("ͷ�Ȳ�")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("�����")&&LuggageWeight<=69&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("���ò�")&&LuggageWeight<=23&&Length+Width+Height<=158&&Luggageamount<=2)
					return SUCCESS;
			if(Carbin.equals("��ͯ")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("������")) {
			if(Carbin.equals("ͷ�Ȳ�")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("�����")&&LuggageWeight<=64&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("���龭�ò�")&&LuggageWeight<=46&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("���ò�")&&LuggageWeight<=23&&Length+Width+Height<=158&&Luggageamount<=1)
					return SUCCESS;
			if(Carbin.equals("��ͯ")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("����")) {
			if(Carbin.equals("ͷ�Ȳ�")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("�����")&&LuggageWeight<=64&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("���ò�")&&LuggageWeight<=23&&Length+Width+Height<=158&&Luggageamount<=1)
					return SUCCESS;
			if(Carbin.equals("��ͯ")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("�ر��ÿ�")) {
			if(Carbin.equals("�Ϻ�����𿨻�Ա")||Carbin.equals("������˳�����Ӣ")&&LuggageWeight<=116&&Length+Width+Height<=158&&Luggageamount<=4)
				return SUCCESS;
			if(Carbin.equals("�Ϻ�����������Ա")||Carbin.equals("������˾�Ӣ")&&LuggageWeight<=74&&Length+Width+Height<=158&&Luggageamount<=4)
				return SUCCESS;
			if(Carbin.equals("��ѧ��")||Carbin.equals("����")||Carbin.equals("��Ա")&&LuggageWeight<=23&&Length+Width+Height<=158&&Luggageamount<=3)
					return SUCCESS;
			
		}
			
		return ERROR;
	}
	public String Compute(String place,double LuggageWeight,int Luggageamount,double Length,double Width,double Height,String Carbin) {
		if(place.equals("����")) {
			if(Carbin.equals("ͷ�Ȳ�")&&LuggageWeight<=40)
				return SUCCESS;
			if(Carbin.equals("�����")&&LuggageWeight<=30)
				return SUCCESS;
			if(Carbin.equals("���ò�")&&LuggageWeight<=20)
				return SUCCESS;
			if(Carbin.equals("��ͯ")&&LuggageWeight<=100)
				return SUCCESS;
		}
		if(place.equals("����һ")) {
			if(Carbin.equals("ͷ�Ȳ�")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("�����")&&LuggageWeight<=64&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("���ò�")&&LuggageWeight<=46&&Length+Width+Height<=158&&Luggageamount<=2)
					return SUCCESS;
			if(Carbin.equals("��ͯ")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("�����")) {
			if(Carbin.equals("ͷ�Ȳ�")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("�����")&&LuggageWeight<=64&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("���ò�")&&LuggageWeight<=32&&Length+Width+Height<=158&&Luggageamount<=1)
					return SUCCESS;
			if(Carbin.equals("��ͯ")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("������")) {
			if(Carbin.equals("ͷ�Ȳ�")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("�����")&&LuggageWeight<=69&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("���ò�")&&LuggageWeight<=23&&Length+Width+Height<=158&&Luggageamount<=2)
					return SUCCESS;
			if(Carbin.equals("��ͯ")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("������")) {
			if(Carbin.equals("ͷ�Ȳ�")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("�����")&&LuggageWeight<=64&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("���龭�ò�")&&LuggageWeight<=46&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("���ò�")&&LuggageWeight<=23&&Length+Width+Height<=158&&Luggageamount<=1)
					return SUCCESS;
			if(Carbin.equals("��ͯ")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("����")) {
			if(Carbin.equals("ͷ�Ȳ�")&&LuggageWeight<=96&&Length+Width+Height<=158&&Luggageamount<=3)
				return SUCCESS;
			if(Carbin.equals("�����")&&LuggageWeight<=64&&Length+Width+Height<=158&&Luggageamount<=2)
				return SUCCESS;
			if(Carbin.equals("���ò�")&&LuggageWeight<=23&&Length+Width+Height<=158&&Luggageamount<=1)
					return SUCCESS;
			if(Carbin.equals("��ͯ")&&LuggageWeight<=10&&Length+Width+Height<=115&&Luggageamount<=1)
				return SUCCESS;
				
		}
		if(place.equals("�ر��ÿ�")) {
			if(Carbin.equals("�Ϻ�����𿨻�Ա")||Carbin.equals("������˳�����Ӣ")&&LuggageWeight<=116&&Length+Width+Height<=158&&Luggageamount<=4)
				return SUCCESS;
			if(Carbin.equals("�Ϻ�����������Ա")||Carbin.equals("������˾�Ӣ")&&LuggageWeight<=74&&Length+Width+Height<=158&&Luggageamount<=4)
				return SUCCESS;
			if(Carbin.equals("��ѧ��")||Carbin.equals("����")||Carbin.equals("��Ա")&&LuggageWeight<=23&&Length+Width+Height<=158&&Luggageamount<=3)
					return SUCCESS;
			
		}
			
		return ERROR;
	}
	

}
