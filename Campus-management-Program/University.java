public class University {
    private String uName;
    private int cCount;
    private Campus campuscount[];
    private int counter=0;

public University(String uName,int cCount){
    this.uName = uName;
    this.campuscount=new Campus[cCount];

}


    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public int getcCount() {
        return cCount;
    }

    public void setcCount(int cCount) {
        this.cCount = cCount;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void addcampus(Campus camp){
        campuscount[counter++]=camp;
    }



    @Override
    public String toString(){
        String campdetails=" \n";
        for (int i = 0; i < counter; i++) {
            campdetails=campdetails+campuscount[i];
        }
        return String.format("\t\t\n\nUNIVERSITY: %s\n\n ",uName)+campdetails;
    }


}
