package Game;
import java.util.Date;
/*
 * Jason Salazar 
 * Data Structures and Algorithms
 * 9/26/2021
 * Assignment 4
 */
public class Unit04 {

        public static void main(String[] args) {
           
        // values of numberOfValues
               
        int[] numberOfValues={2000,4000,36000,38000,31000,12550,14500,1600,1800,2000,25000,35000,37000,44000,39000};
           
        // counting time for Algorithms A,B,C
           
        long[] counterForA=new long[numberOfValues.length];        
                     
        long[] counterForB=new long[numberOfValues.length];        
   
        long[] counterForC=new long[numberOfValues.length];        
           
        int numberOfAlgorithms=3;
        long elapsedTime;  
        long startTime;
        long stopTime;
        Date current = new Date();
        // loop running the 3 algorithms.
        
        
        
           
for(int Algorithm=1;Algorithm<=numberOfAlgorithms;Algorithm++){
         
			if(Algorithm==1)
               
					System.out.println("Algorithm A: (Finished)");
                   
else 		if(Algorithm==2)
               
					System.out.println("Algorithm B: (Finished)");
                   
else
               
					System.out.println("Algorithm C: (Finished)");

			
			
for(int i=0;i<numberOfValues.length;i++){

//AlgorithmA
if(Algorithm==1){
//timing

current = new Date();
startTime=current.getTime();

alogrithmA(numberOfValues[i]);
 
stopTime = System.currentTimeMillis();

counterForA[i]=stopTime-startTime;

                             
}


//AlgorithmB
else if(Algorithm==2){
//timing
 current= new Date();
startTime=current.getTime();

alogrithmB(numberOfValues[i]);


stopTime = System.currentTimeMillis();

counterForB[i]=stopTime-startTime;


}



//AlgorithmC
else{
//timing
 current= new Date();

 startTime=current.getTime();

alogrithmC(numberOfValues[i]);

current=new Date();

stopTime = System.currentTimeMillis();

 counterForC[i]=stopTime-startTime;


}
   //rest                            

}
}
System.out.println("Results");
System.out.println("\t\t\tA(msec)\t\t\tB(msec)\t\t\tC(msec)");
for(int i=0;i<numberOfValues.length;i++){
System.out.println(numberOfValues[i]+"\t\t\t"+counterForA[i]+"\t\t\t"+counterForB[i]+"\t\t\t"+counterForC[i]);
}
}

public static void alogrithmA(int numberOfValues){

long sum=0;

for(long i=1;i<=numberOfValues;i++){

sum=sum+i;

}


}

public static void alogrithmB(int numberOfValues){

long sum=0;

for(long i=1;i<=numberOfValues;i++)

{

for(long j=1;j<=i;j++){

sum=sum+i;

}

}

}

public static void alogrithmC(int numberOfValues){

	long sum=numberOfValues*(numberOfValues+1)/2;

}

}