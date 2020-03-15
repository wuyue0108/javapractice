package bookmanage;
import java.util.Scanner;
public class bookmanage {
	 public static void main(String[] args){
			String[] name=new String[50];//书名
			int[] state=new int[50];//0借出 1可借
			String[] date=new String[50];//借出日期
			int[] count=new int[50];//借出次数
			
			//初始化
			name[0]="数据结构";
			state[0]=0;
			date[0]="2018-7-1";
			count[0]=15;
			
			name[1]="数据库";
			state[1]=1;
			count[1]=12;
			
			name[2]="离散数学";
			state[2]=0;
			count[2]=11;
			
			boolean flag=true;
			Scanner a=new Scanner(System.in);
			int num;
			
			
			do{
				System.out.println("******欢迎使用本图书管理系统*****");
		        System.out.println("******1.查看图书*****");        
		        System.out.println("******2.新增图书*****");    
		        System.out.println("******3.借阅图书*****");    
		        System.out.println("******4.归还图书*****");
		        System.out.println("******5.删除图书*****");
		        System.out.println("******6.退出系统*****");
		        System.out.println("请进行你的操作");
		        int input=a.nextInt();
		        
		        switch(input){
		        case 1:
					 System.out.println("图书列表");
					 System.out.println("图书序号\t图书名称\t图书状态\t借阅时间\t\t借阅次数");
					 for(int i=0;i<name.length;i++) {
						 if(name[i]!=null){
		                     String states=(state[i]==0?"可借阅":"已借出");
		                     System.out.println((i+1)+"\t"+name[i]+"\t"+states+"\t"+date[i]+"\t\t"+count[i]);
				             }
						 else {
							 break;
						     }
					 }
					 break;
		        		
					 
		        case 2:
					 System.out.println("新增图书");
					 for(int j=0;j<name.length;j++) {
						 if(name[j]!=null){
						 }
						 else {
							 System.out.println("输入图书名称");
							 Scanner in=new Scanner(System.in);
							 String name_input=in.nextLine();
							 name[j]=name_input;
							 System.out.println("输入图书借阅次数");
							 Scanner input1=new Scanner(System.in);
							 int count_input=input1.nextInt();
							 count[j]=count_input;
							 break;
						     }
						 }
					 break;
					 
					 
		        case 3:
		        	System.out.println("请输入借阅图书名称");
			        String borrow_name=a.next();
		        	for(int i=0;i<name.length;i++) {
		        		if((name[i].equals(borrow_name))&&state[i]==0) {
		        			System.out.println("请输入借阅日期");
		        			String borrow_date=a.next();
		        			date[i]=borrow_date;
		        			System.out.println("借阅成功");
		        			state[i]=1;
		        			count[i]++;
		        			break;
		        		}
		        	}
		        	break;
		        	
		        	
		        case 4://归还图书
		        	System.out.println("请输入归还图书名称");
		        	String return_name=a.next();
		        	System.out.println("请输入归还日期");
		        	String return_date=a.next();
		        	for(int i=0;i<name.length;i++) {
						 if(name[i]==null){
							 name[i]=return_name;
							 date[i]=return_date;
							 count[i]=1;
							 break;
						 }
		        	}
		        	break;
		        
		        	
		        	
		     
		        case 5://删除图书
		        	int index=-1;
	                 System.out.print("请删除不需要的老图书");
	                 String delete=a.next();
	                 for(int i=0;i<name.length-1;i++){
	                     if(name[i].equals(delete)){
	                         index=i;
	                         break;
	                     }
	                 }
	                 if(index!=-1){
	                     for(int i=index;i<name.length;i++){
	                     if(i!=name.length-1){
	                     name[i]=name[i+1];
	                     date[i]=date[i+1];
	                     count[i]=count[i+1];}
	                 }
	                 System.out.print("删除成功");
	                 }
	                  break;
		        	
		        case 6:
		        	flag=false;
		        	break;
		        	
		        default:
		        	flag=false;
		        	break;
		        }
		        
		        
		        if(flag==false) {
		        	break;
		        }else{
		        	System.out.print("请输入0返回主菜单");
		            num=a.nextInt();
		        }
				
			}while(num==0);
	         System.out.println("谢谢使用");
		
	 }
}












































