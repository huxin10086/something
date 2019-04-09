package NotFree;
import com.opensymphony.xwork2.ActionSupport;
public class Destination extends ActionSupport{
	private String place;
	private double OverWeight;
	private int   Overamount;
	private double OverFree;
	private double TicketFree;
	private double Length;
	private double Width;
	private double Height;
	private String Carbin;
	public double getTicketFree() {
		return TicketFree;
	}
	public void setTicketFree(double ticketFree) {
		if(ticketFree>=0)
		TicketFree = ticketFree;
		else {
			System.out.println("机票价格输入错误！");
		}
	}
	public double getOverWeight() {
		return OverWeight;
	}
	public void setOverWeight(double overWeight) {
		if(overWeight>=0)
		OverWeight = overWeight;
		else {
			System.out.println("超重数据输入错误！");
		}
	}
	public int getOveramount() {
		return Overamount;
	}
	public void setOveramount(int overamount) {
		if(overamount>=0)
		Overamount = overamount;
		else {
			System.out.println("超出包裹数据输入错误！");
		}
	}
	public double getOverFree() {
		return OverFree;
	}
	public void setOverFree(double overFree) {
		
		OverFree = overFree;
		
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
	public String Compute1() {
		if(place.equals("中国")) {
			OverFree=TicketFree*0.015;
			return SUCCESS;
		}
		if(place.equals("区域一")) {
			if(Carbin.equals("头等舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount==1) {
				OverFree=1000;
				return SUCCESS;}
			if(Carbin.equals("公务舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount==1) {
				OverFree=1000;
				return SUCCESS;}
			if(Carbin.equals("头等舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount>=2) {
					OverFree=2000*Overamount;
					return SUCCESS;
			}
			if(Carbin.equals("公务舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount>=2) {
				OverFree=2000*Overamount;
				return SUCCESS;
		}
			if(Carbin.equals("头等舱")&&Length+Width+Height>=159&&Length+Width+Height<=300) {
						OverFree=1000;
						return SUCCESS;}
			if(Carbin.equals("公务舱")&&Length+Width+Height>=159&&Length+Width+Height<=300) {
				OverFree=1000;
				return SUCCESS;}
			if(Carbin.equals("头等舱")&&OverWeight>=32&&OverWeight<=45) {
							OverFree=3000;
							return SUCCESS;}
			if(Carbin.equals("公务舱")&&OverWeight>=32&&OverWeight<=45) {
				OverFree=3000;
				return SUCCESS;}
			if(Carbin.equals("经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount==1) {
								OverFree=1000;
								return SUCCESS;}
			if(Carbin.equals("明珠经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount==1) {
				OverFree=1000;
				return SUCCESS;}
			if(Carbin.equals("经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount>=2) {
									OverFree=2000*Overamount;
									return SUCCESS;}
			if(Carbin.equals("明珠经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount>=2) {
				OverFree=2000*Overamount;
				return SUCCESS;}
			if(Carbin.equals("经济舱")&&Length+Width+Height<=159&&Length+Width+Height>=300) {
										OverFree=1000;
										return SUCCESS;}
			if(Carbin.equals("明珠经济舱")&&Length+Width+Height<=159&&Length+Width+Height>=300) {
				OverFree=1000;
				return SUCCESS;}
			if(Carbin.equals("经济舱")&&OverWeight>=23&&OverWeight<=32) {
											OverFree=1000;
											return SUCCESS;}
			if(Carbin.equals("明珠经济舱")&&OverWeight>=23&&OverWeight<=32) {
				OverFree=1000;
				return SUCCESS;}
			if(Carbin.equals("经济舱")&&OverWeight>=32&&OverWeight<=45) {
												OverFree=3000;
												return SUCCESS;}	
			if(Carbin.equals("明珠经济舱")&&OverWeight>=32&&OverWeight<=45) {
				OverFree=3000;
				return SUCCESS;}	
			}
	
		if(place.equals("区域二")) {
			if(OverWeight<=32&&Length+Width+Height<=158&&Overamount==1) {
				OverFree=450;
				return SUCCESS;}
			if(OverWeight<=32&&Length+Width+Height<=158&&Overamount>=2) {
					OverFree=Overamount*1300;
					return SUCCESS;}
			if(Length+Width+Height>=159&&Length+Width+Height<=300) {
						OverFree=1000;
						return SUCCESS;}
			if(OverWeight>=32&&OverWeight<=45) {
							OverFree=3000;
							return SUCCESS;
		}
		}
		
		
			if(place.equals("区域三")) {
				if(Carbin.equals("头等舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount==1) {
					OverFree=1000;
					return SUCCESS;}
				if(Carbin.equals("公务舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount==1) {
					OverFree=1000;
					return SUCCESS;}
				if(Carbin.equals("头等舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount>=2) {
						OverFree=2000*Overamount;
						return SUCCESS;}
				if(Carbin.equals("公务舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount>=2) {
					OverFree=2000*Overamount;
					return SUCCESS;}
				if(Carbin.equals("头等舱")&&Length+Width+Height>=159&&Length+Width+Height<=300) {
							OverFree=1000;
							return SUCCESS;}
				if(Carbin.equals("公务舱")&&Length+Width+Height>=159&&Length+Width+Height<=300) {
					OverFree=1000;
					return SUCCESS;}
				if(Carbin.equals("头等舱")&&OverWeight>=32&&OverWeight<=45) {
								OverFree=3000;
								return SUCCESS;}
				if(Carbin.equals("公务舱")&&OverWeight>=32&&OverWeight<=45) {
					OverFree=3000;
					return SUCCESS;}
				if(Carbin.equals("经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount==1) {
									OverFree=1000;
									return SUCCESS;}
				if(Carbin.equals("明珠经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount==1) {
					OverFree=1000;
					return SUCCESS;}
				if(Carbin.equals("经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount>=2) {
										OverFree=2000*Overamount;
										return SUCCESS;}
				if(Carbin.equals("明珠经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount>=2) {
					OverFree=2000*Overamount;
					return SUCCESS;}
				if(Carbin.equals("经济舱")&&Length+Width+Height<=159&&Length+Width+Height>=300) {
											OverFree=1000;
											return SUCCESS;}
				if(Carbin.equals("明珠经济舱")&&Length+Width+Height<=159&&Length+Width+Height>=300) {
					OverFree=1000;
					return SUCCESS;}
				if(Carbin.equals("经济舱")&&OverWeight>=23&&OverWeight<=32) {
												OverFree=2000;
												return SUCCESS;}
				if(Carbin.equals("明珠经济舱")&&OverWeight>=23&&OverWeight<=32) {
					OverFree=2000;
					return SUCCESS;}
				if(Carbin.equals("经济舱")&&OverWeight>=32&&OverWeight<=45) {
													OverFree=3000;
													return SUCCESS;
				}
				if(Carbin.equals("明珠经济舱")&&OverWeight>=32&&OverWeight<=45) {
					OverFree=3000;
					return SUCCESS;
}
		}
		
			if(place.equals("区域四")) {
				if(Carbin.equals("头等舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount==1) {
					OverFree=450*Overamount;
					return SUCCESS;}
				if(Carbin.equals("头等舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount>=2) {
						OverFree=1300*Overamount;
						return SUCCESS;}
				if(Carbin.equals("头等舱")&&Length+Width+Height>=159&&Length+Width+Height<=300) {
							OverFree=1000;
							return SUCCESS;}
				if(Carbin.equals("头等舱")&&OverWeight>=32&&OverWeight<=45) {
								OverFree=3000;
								return SUCCESS;}
				if(Carbin.equals("经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount==1) {
									OverFree=450*Overamount;
									return SUCCESS;}
				if(Carbin.equals("明珠经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount==1) {
										OverFree=450*Overamount;
										return SUCCESS;}
				if(Carbin.equals("公务舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount==1) {
											OverFree=450*Overamount;
											return SUCCESS;}
				if(Carbin.equals("经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount>=2) {
											OverFree=1300*Overamount;
											return SUCCESS;}
				if(Carbin.equals("明珠经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount>=2) {
												OverFree=1300*Overamount;
												return SUCCESS;}
				if(Carbin.equals("公务舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount>=2) {
														OverFree=1300*Overamount;
														return SUCCESS;}
				if(Carbin.equals("经济舱")&&Length+Width+Height<=159&&Length+Width+Height>=300) {
																	OverFree=1000;
																	return SUCCESS;}
				if(Carbin.equals("明珠经济舱")&&Length+Width+Height<=159&&Length+Width+Height>=300) {
																				OverFree=1000;
																				return SUCCESS;}
				if(Carbin.equals("公务舱")&&Length+Width+Height<=159&&Length+Width+Height>=300) {
																				OverFree=1000;
																				return SUCCESS;}
				if(Carbin.equals("经济舱")&&OverWeight>=23&&OverWeight<=32) {
													OverFree=1000;
													return SUCCESS;}
				if(Carbin.equals("明珠经济舱")&&OverWeight>=23&&OverWeight<=32) {
								OverFree=1000;
								return SUCCESS;}
				if(Carbin.equals("公务舱")&&OverWeight>=23&&OverWeight<=32) {
									OverFree=1000;
									return SUCCESS;}
				if(Carbin.equals("经济舱")&&OverWeight>=32&&OverWeight<=45) {
													OverFree=3000;
													return SUCCESS;}
				if(Carbin.equals("明珠经济舱")&&OverWeight>=32&&OverWeight<=45) {
										OverFree=3000;
										return SUCCESS;}
				if(Carbin.equals("公务舱")&&OverWeight>=32&&OverWeight<=45) {
											OverFree=3000;
											return SUCCESS;}
			}
		return ERROR;
	}
	public double Compute2(String place,double OverWeight,int Overamount, double TicketFree,double Length,double Width,double Height,String Carbin) {
		if(place.equals("中国")) {
			OverFree=TicketFree*0.015;
			return OverFree;
		}
		if(place.equals("区域一")) {
			if(Carbin.equals("头等舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount==1) {
				OverFree=1000;
				return OverFree;}
			if(Carbin.equals("公务舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount==1) {
				OverFree=1000;
				return OverFree;}
			if(Carbin.equals("头等舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount>=2) {
					OverFree=2000*Overamount;
					return OverFree;
			}
			if(Carbin.equals("公务舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount>=2) {
				OverFree=2000*Overamount;
				return OverFree;
		}
			if(Carbin.equals("头等舱")&&Length+Width+Height>=159&&Length+Width+Height<=300) {
						OverFree=1000;
						return OverFree;}
			if(Carbin.equals("公务舱")&&Length+Width+Height>=159&&Length+Width+Height<=300) {
				OverFree=1000;
				return OverFree;}
			if(Carbin.equals("头等舱")&&OverWeight>=32&&OverWeight<=45) {
							OverFree=3000;
							return OverFree;}
			if(Carbin.equals("公务舱")&&OverWeight>=32&&OverWeight<=45) {
				OverFree=3000;
				return OverFree;}
			if(Carbin.equals("经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount==1) {
								OverFree=1000;
								return OverFree;}
			if(Carbin.equals("明珠经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount==1) {
				OverFree=1000;
				return OverFree;}
			if(Carbin.equals("经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount>=2) {
									OverFree=2000*Overamount;
									return OverFree;}
			if(Carbin.equals("明珠经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount>=2) {
				OverFree=2000*Overamount;
				return OverFree;}
			if(Carbin.equals("经济舱")&&Length+Width+Height<=159&&Length+Width+Height>=300) {
										OverFree=1000;
										return OverFree;}
			if(Carbin.equals("明珠经济舱")&&Length+Width+Height<=159&&Length+Width+Height>=300) {
				OverFree=1000;
				return OverFree;}
			if(Carbin.equals("经济舱")&&OverWeight>=23&&OverWeight<=32) {
											OverFree=1000;
											return OverFree;}
			if(Carbin.equals("明珠经济舱")&&OverWeight>=23&&OverWeight<=32) {
				OverFree=1000;
				return OverFree;}
			if(Carbin.equals("经济舱")&&OverWeight>=32&&OverWeight<=45) {
												OverFree=3000;
												return OverFree;}	
			if(Carbin.equals("明珠经济舱")&&OverWeight>=32&&OverWeight<=45) {
				OverFree=3000;
				return OverFree;}	
			}
	
		if(place.equals("区域二")) {
			if(OverWeight<=32&&Length+Width+Height<=158&&Overamount==1) {
				OverFree=450;
				return OverFree;}
			if(OverWeight<=32&&Length+Width+Height<=158&&Overamount>=2) {
					OverFree=Overamount*1300;
					return OverFree;}
			if(Length+Width+Height>=159&&Length+Width+Height<=300) {
						OverFree=1000;
						return OverFree;}
			if(OverWeight>=32&&OverWeight<=45) {
							OverFree=3000;
							return OverFree;
		}
		}
		
		
			if(place.equals("区域三")) {
				if(Carbin.equals("头等舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount==1) {
					OverFree=1000;
					return OverFree;}
				if(Carbin.equals("公务舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount==1) {
					OverFree=1000;
					return OverFree;}
				if(Carbin.equals("头等舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount>=2) {
						OverFree=2000*Overamount;
						return OverFree;}
				if(Carbin.equals("公务舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount>=2) {
					OverFree=2000*Overamount;
					return OverFree;}
				if(Carbin.equals("头等舱")&&Length+Width+Height>=159&&Length+Width+Height<=300) {
							OverFree=1000;
							return OverFree;}
				if(Carbin.equals("公务舱")&&Length+Width+Height>=159&&Length+Width+Height<=300) {
					OverFree=1000;
					return OverFree;}
				if(Carbin.equals("头等舱")&&OverWeight>=32&&OverWeight<=45) {
								OverFree=3000;
								return OverFree;}
				if(Carbin.equals("公务舱")&&OverWeight>=32&&OverWeight<=45) {
					OverFree=3000;
					return OverFree;}
				if(Carbin.equals("经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount==1) {
									OverFree=1000;
									return OverFree;}
				if(Carbin.equals("明珠经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount==1) {
					OverFree=1000;
					return OverFree;}
				if(Carbin.equals("经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount>=2) {
										OverFree=2000*Overamount;
										return OverFree;}
				if(Carbin.equals("明珠经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount>=2) {
					OverFree=2000*Overamount;
					return OverFree;}
				if(Carbin.equals("经济舱")&&Length+Width+Height<=159&&Length+Width+Height>=300) {
											OverFree=1000;
											return OverFree;}
				if(Carbin.equals("明珠经济舱")&&Length+Width+Height<=159&&Length+Width+Height>=300) {
					OverFree=1000;
					return OverFree;}
				if(Carbin.equals("经济舱")&&OverWeight>=23&&OverWeight<=32) {
												OverFree=2000;
												return OverFree;}
				if(Carbin.equals("明珠经济舱")&&OverWeight>=23&&OverWeight<=32) {
					OverFree=2000;
					return OverFree;}
				if(Carbin.equals("经济舱")&&OverWeight>=32&&OverWeight<=45) {
													OverFree=3000;
													return OverFree;
				}
				if(Carbin.equals("明珠经济舱")&&OverWeight>=32&&OverWeight<=45) {
					OverFree=3000;
					return OverFree;
}
		}
		
			if(place.equals("区域四")) {
				if(Carbin.equals("头等舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount==1) {
					OverFree=450*Overamount;
					return OverFree;}
				if(Carbin.equals("头等舱")&&OverWeight<=32&&Length+Width+Height<=158&&Overamount>=2) {
						OverFree=1300*Overamount;
						return OverFree;}
				if(Carbin.equals("头等舱")&&Length+Width+Height>=159&&Length+Width+Height<=300) {
							OverFree=1000;
							return OverFree;}
				if(Carbin.equals("头等舱")&&OverWeight>=32&&OverWeight<=45) {
								OverFree=3000;
								return OverFree;}
				if(Carbin.equals("经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount==1) {
									OverFree=450*Overamount;
									return OverFree;}
				if(Carbin.equals("明珠经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount==1) {
										OverFree=450*Overamount;
											return OverFree;}
				if(Carbin.equals("公务舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount==1) {
											OverFree=450*Overamount;
													return OverFree;}
				if(Carbin.equals("经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount>=2) {
											OverFree=1300*Overamount;
											return OverFree;}
				if(Carbin.equals("明珠经济舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount>=2) {
												OverFree=1300*Overamount;
													return OverFree;}
				if(Carbin.equals("公务舱")&&OverWeight<=23&&Length+Width+Height<=158&&Overamount>=2) {
														OverFree=1300*Overamount;
															return OverFree;}
				if(Carbin.equals("经济舱")&&Length+Width+Height<=159&&Length+Width+Height>=300) {
																	OverFree=1000;
																		return OverFree;}
				if(Carbin.equals("明珠经济舱")&&Length+Width+Height<=159&&Length+Width+Height>=300) {
																				OverFree=1000;
																					return OverFree;}
				if(Carbin.equals("公务舱")&&Length+Width+Height<=159&&Length+Width+Height>=300) {
																				OverFree=1000;
																					return OverFree;}
				if(Carbin.equals("经济舱")&&OverWeight>=23&&OverWeight<=32) {
													OverFree=1000;
														return OverFree;}
				if(Carbin.equals("明珠经济舱")&&OverWeight>=23&&OverWeight<=32) {
								OverFree=1000;
									return OverFree;}
				if(Carbin.equals("公务舱")&&OverWeight>=23&&OverWeight<=32) {
									OverFree=1000;
										return OverFree;}
				if(Carbin.equals("经济舱")&&OverWeight>=32&&OverWeight<=45) {
													OverFree=3000;
													return OverFree;}
				if(Carbin.equals("明珠经济舱")&&OverWeight>=32&&OverWeight<=45) {
										OverFree=3000;
											return OverFree;}
				if(Carbin.equals("公务舱")&&OverWeight>=32&&OverWeight<=45) {
											OverFree=3000;
												return OverFree;}
			}
		return -1;
	}

}
