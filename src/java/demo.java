package java;

public class demo {
	private int age;

		        public  int getAge(){
		            
		            return age;}
		        
		        void setAge(int age){
		            
		            this.age = age;}
		        
		        static void main(int age){
		            
		            if(age>=18){
		                throw new ArithmeticException("Person is not eligible to vote");    
		            }
		            else
		            {
		                   System.out.println("Person is eligible to vote!!");}}
		}
		class Main
		{
		public static void main(String[] args) 
		{
		demo obj = new demo();
		obj.setAge(15);
		System.out.println(getAge());
		            
		        

		
		}
		    }
		         
