public class Pc {
    private static int id=1;
    private String Ram;
    private String Hdd;
    private String Processor;
    private String LcdMaker;
    private boolean HasGpu;

    public Pc( String ram, String hdd, String processor, String lcdMaker, boolean hasGpu) {
       // this.id = id;
        Ram = ram;
        Hdd = hdd;
        Processor = processor;
        LcdMaker = lcdMaker;
        HasGpu = hasGpu;
    }




    public static int getId() {
        return id;
    }



    public void setRam(String ram) {
        Ram = ram;
    }

    public void setHdd(String hdd) {
        this.Hdd = hdd;
    }

    public void setProcessor(String processor) {
        this.Processor = processor;
    }

    public void setLcdMaker(String lcdMaker) {
        this.LcdMaker = lcdMaker;
    }

    public void setHasGpu(boolean hasGpu) {
        this.HasGpu = hasGpu;
    }

    public String getRam() {
        return Ram;
    }

    public String getHdd() {
        return Hdd;
    }

    public String getProcessor() {
        return Processor;
    }

    public String getLcdMaker() {
        return LcdMaker;
    }

    public boolean isHasGpu() {
        return HasGpu;
    }


    @Override
    public String toString(){
        return String.format("Pc details:\n\nId:%d\nRam:%s\nHdd:%s\nProcessor:%s\nLcd Company:%s\nHasGpu:%b\n______________\n",id++,Ram,Hdd,Processor,LcdMaker,HasGpu);
    }

//    @Override
//    public boolean equals(Object o){
//        Pc temp=(Pc)o;
//        return this.Ram==temp.Ram;
//    }
}


