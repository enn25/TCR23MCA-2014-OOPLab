class ProductWithConst
{
int pcode;
String pname;
double price;
double lowest;

productwithconst(int c,String n,double p){
	this.pcode = c;
	this.pname = n;
	this.price =p;
	}

void display(){
	System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
}

static void LowestNum(double price1 ,double price2,double price3){
	if(price1 < price2 && price1<price3){
		System.out.println("\n\nThe product 1 is smallest with price "+price1);
	}
	else if(price2 < price1 && price2<price3){
		System.out.println("\n\nThe product 2 is smallest with price "+price2);
	}
	else{
		System.out.println("\n\nThe product 3 is smallest with price "+price3);
	}
}

public static void main(String args[]){
	productwithconst obj1 = new productwithconst(234,"Soap",120.0);
	productwithconst obj2 = new productwithconst(516,"Jam",7.0);
	productwithconst obj3 = new productwithconst(789,"Tin",20.0);
	
	
	System.out.println("PCODE\t\tPNAME\t\tPRICE");
	obj1.display();
	obj2.display();
	obj3.display();
	
	LowestNum(obj1.price,obj2.price,obj3.price);
}
}
