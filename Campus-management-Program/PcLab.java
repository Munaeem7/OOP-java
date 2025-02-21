public class PcLab {
    private String labName;
    private String labAssistant;
    private String labIncharge;
    private Pc pclist[];
    private int counter = 0;

    public PcLab(String labName, String labAssistant, String labIncharge, int pcCount) {
        this.labName = labName;
        this.labAssistant = labAssistant;
        this.labIncharge = labIncharge;
        this.pclist = new Pc[pcCount];
    }


    public Pc[] getPclist() {
        return pclist;
    }

    public void addPc(Pc pc) {
        if (counter < pclist.length) {
            pclist[counter++] = pc;
            // System.out.println("New Pc is added successfully..\n");
        } else {
            System.out.println("lab is full. so no pc can added.\n");
        }
    }


    public Pc[] getPc() {
        return pclist;
    }

    @Override
    public String toString() {
        String pcdetails = "  \n";
        for (int i = 0; i < counter; i++) {
            pcdetails = pcdetails + pclist[i];
        }
        return String.format(
                "\n_________PCLAB DETAILS:_________\n\nlabName:%s\nlabAssistant:%s\nlabIncharge:%s\nNo of Pcs:%d\n",
                labName, labAssistant, labIncharge, pclist.length) + pcdetails;
    }

    @Override
    public boolean equals(Object o){
        PcLab n=(PcLab)o;
        return this.labName==n.labName;
    }

    // to delete a pc
    //
//    public void removepc(int id) {
//        for (int i = 0; i < counter; i++) {
//            if (pclist[i].getId() == id) {
//                for (int j = 0; j < counter - 1; j++) {
//                    pclist[j] = pclist[j + 1];
//                }
//                counter--;
//            }
//        }
//
//    }

}
