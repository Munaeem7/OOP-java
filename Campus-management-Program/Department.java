public class Department{
private String dName;
private String dHead;
private PcLab pclabs[];
private int counter;
	
public Department(String dName,String dHead,int depCount){
this.dName=dName;
this.dHead=dHead;
this.pclabs=new PcLab[depCount];
}

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdHead() {
        return dHead;
    }

    public void setdHead(String dHead) {
        this.dHead = dHead;
    }

    public PcLab[] getPclabs() {
        return pclabs;
    }

    public void setPclabs(PcLab[] pclabs) {
        this.pclabs = pclabs;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void addNewLab(PcLab lab){

    pclabs[counter++]=lab;
}

public PcLab[] getPcLabs(){
return pclabs;
}


@Override
public String toString(){
String depdetails="  \n";
for(int i=0;i<counter;i++){
depdetails =depdetails+pclabs[i];
}
return String.format("\n_________DEPARTMENT DETAILS:__________\nDepartment name:%s\nDepartment head:%s\nNo of labs:%d",dName,dHead,pclabs.length)+depdetails;
}

//    public void removepclab(int id){
//        for(int i=0;i<counter;i++){
//            if(pclabs[i].getId()==id){
//                for(int j=0;j<counter-1;j++){
//                    pclabs[j]=pclabs[j+1];
//                }
//                counter--;
//            }
//        }
////
//    }



}