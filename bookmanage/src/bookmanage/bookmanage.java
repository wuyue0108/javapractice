package bookmanage;
import java.util.Scanner;
public class bookmanage {
	 public static void main(String[] args){
			String[] name=new String[50];//����
			int[] state=new int[50];//0��� 1�ɽ�
			String[] date=new String[50];//�������
			int[] count=new int[50];//�������
			
			//��ʼ��
			name[0]="���ݽṹ";
			state[0]=0;
			date[0]="2018-7-1";
			count[0]=15;
			
			name[1]="���ݿ�";
			state[1]=1;
			count[1]=12;
			
			name[2]="��ɢ��ѧ";
			state[2]=0;
			count[2]=11;
			
			boolean flag=true;
			Scanner a=new Scanner(System.in);
			int num;
			
			
			do{
				System.out.println("******��ӭʹ�ñ�ͼ�����ϵͳ*****");
		        System.out.println("******1.�鿴ͼ��*****");        
		        System.out.println("******2.����ͼ��*****");    
		        System.out.println("******3.����ͼ��*****");    
		        System.out.println("******4.�黹ͼ��*****");
		        System.out.println("******5.ɾ��ͼ��*****");
		        System.out.println("******6.�˳�ϵͳ*****");
		        System.out.println("�������Ĳ���");
		        int input=a.nextInt();
		        
		        switch(input){
		        case 1:
					 System.out.println("ͼ���б�");
					 System.out.println("ͼ�����\tͼ������\tͼ��״̬\t����ʱ��\t\t���Ĵ���");
					 for(int i=0;i<name.length;i++) {
						 if(name[i]!=null){
		                     String states=(state[i]==0?"�ɽ���":"�ѽ��");
		                     System.out.println((i+1)+"\t"+name[i]+"\t"+states+"\t"+date[i]+"\t\t"+count[i]);
				             }
						 else {
							 break;
						     }
					 }
					 break;
		        		
					 
		        case 2:
					 System.out.println("����ͼ��");
					 for(int j=0;j<name.length;j++) {
						 if(name[j]!=null){
						 }
						 else {
							 System.out.println("����ͼ������");
							 Scanner in=new Scanner(System.in);
							 String name_input=in.nextLine();
							 name[j]=name_input;
							 System.out.println("����ͼ����Ĵ���");
							 Scanner input1=new Scanner(System.in);
							 int count_input=input1.nextInt();
							 count[j]=count_input;
							 break;
						     }
						 }
					 break;
					 
					 
		        case 3:
		        	System.out.println("���������ͼ������");
			        String borrow_name=a.next();
		        	for(int i=0;i<name.length;i++) {
		        		if((name[i].equals(borrow_name))&&state[i]==0) {
		        			System.out.println("�������������");
		        			String borrow_date=a.next();
		        			date[i]=borrow_date;
		        			System.out.println("���ĳɹ�");
		        			state[i]=1;
		        			count[i]++;
		        			break;
		        		}
		        	}
		        	break;
		        	
		        	
		        case 4://�黹ͼ��
		        	System.out.println("������黹ͼ������");
		        	String return_name=a.next();
		        	System.out.println("������黹����");
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
		        
		        	
		        	
		     
		        case 5://ɾ��ͼ��
		        	int index=-1;
	                 System.out.print("��ɾ������Ҫ����ͼ��");
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
	                 System.out.print("ɾ���ɹ�");
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
		        	System.out.print("������0�������˵�");
		            num=a.nextInt();
		        }
				
			}while(num==0);
	         System.out.println("ллʹ��");
		
	 }
}












































