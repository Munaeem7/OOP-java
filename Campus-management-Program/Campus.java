public class Campus {
    private String cName;
    private String address;
    private String vcName;
    private Department deplist[];

    private int counter;

    public Campus(String cName, String address,String vcName,int depcount) {
        this.cName = cName;
        this.address=address;
        this.vcName = vcName;
        this.deplist=new Department[depcount];
    }

    public String getcName() {
        return cName;
    }

    public String getVcName() {
        return vcName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void adddepartment(Department dep){

        deplist[counter++]=dep;
    }

    public int getCounter() {
        return counter;
    }

    public Department[] getDeplist() {
        return deplist;
    }

    @Override
    public String toString(){
        String depdetails="  \n";
        for (int i = 0; i < counter; i++) {
            depdetails=depdetails+deplist[i];
        }
        return String.format("--Campus details--\nCampus name:%s\ncampus Address:%s\nCampus vc name:%s\nNo of Departments:%d\n",cName,address,vcName,deplist.length)+depdetails;
    }
    @Override
    public boolean equals(Object o){
        Campus c =(Campus)o;
        return c.equals(cName);
    }

}
