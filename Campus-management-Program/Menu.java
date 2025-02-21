import java.util.Scanner;

public class Menu {
    public static final String ANSI_CLEAR_SCREEN = "\u001B[2J\u001B[H";
    String cname;
    String depname;
    String labaname;
    String labname;

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        Department department = null;
        PcLab lab = null;
        Pc pc;


        System.out.println("Welcome to campus managment system:--");
        Campus campus = addCampus(scanner);
//        System.out.println("Campus " + cname + " created successfully..");


        char ch;
        do {
            clearScreen();
            System.out.println("menu:");
            System.out.println("Enter your choice:");
            System.out.println("1.add data Department in campus--:");
            System.out.println("2.add a lab in department--:");
            System.out.println("3.add a Pc in lab--:");
            System.out.println("4.Print all data--:");
            System.out.println("enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {

                case 1:
                    if (campus.getDeplist().length>0) {
                        department = addDepartment(scanner);
                        campus.adddepartment(department);
                        System.out.printf("Department added successfully to capmus %s..\n", cname);
                    }else{
                        System.out.println("department cannot be added..");
                    }
                    break;
                case 2:
                    if (department == null) {
                        System.out.println("create a department first---");
                        break;
                    }
                    lab = addLab(scanner);
                    department.addNewLab(lab);
                    System.out.println("Lab " + labname + " created successfully in department "+ depname+" ..");

                    break;
                case 3:
                    if (lab == null) {
                        System.out.println("create a lab first---");
                        break;
                    }

                    pc = addPc(scanner);
                    lab.addPc(pc);
                    System.out.println("Pc created successfully in lab "+labname+" ..");
                    break;
                case 4:
                    System.out.println(campus);
                    break;


                default:
                    System.out.println("invalid input__");
                    break;


            }
            scanner.nextLine();
            System.out.println("Do you want to continue(y/n):");
            ch = scanner.next().charAt(0);
            scanner.nextLine();
        } while (ch == 'y' || ch == 'Y');

    }

    public static void clearScreen() {
        System.out.print(ANSI_CLEAR_SCREEN);
        System.out.flush();
    }
    private Department addDepartment(Scanner scanner){
        clearScreen();

        System.out.println("enter dep name:");
        depname = scanner.nextLine();
        System.out.println("enter head name:");
        String hname = scanner.nextLine();
        System.out.println("enter no of labs:");
        int labs = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Department " + depname + " created successfully..");
        return new Department(depname,hname,labs);
    }
    private Campus addCampus(Scanner scanner){
        clearScreen();
        System.out.printf("enter campus name:");
        cname = scanner.nextLine();
        System.out.printf("enter campus address:");
        String caddress = scanner.nextLine();
        System.out.printf("enter vc name of campus:");
        String vcname = scanner.nextLine();
        int depcount=0;
        boolean isint=false;
        while(!isint){
            System.out.printf("enter no of dep in campus :");
            if(scanner.hasNextInt()){
                depcount= scanner.nextInt();
                isint=true;
                break;
            }else{
                System.out.println("enter a proper integer value..");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        System.out.println("Campus " + cname + " created with "+depcount+" departments successfully..");
        return new Campus(cname,caddress,vcname,depcount);
    }
    private PcLab addLab(Scanner scanner){
        clearScreen();
        System.out.println("enter lab name:");
        labname = scanner.nextLine();
        System.out.println("enter labassistant name:");
        labaname = scanner.nextLine();
        System.out.println("enter labincharge name:");
        String labiname = scanner.nextLine();
        int pcs=0;
        boolean ispccount=false;
        while (!ispccount){
            System.out.println("enter no of pc's:");
            if(scanner.hasNextInt()){
                pcs=scanner.nextInt();
                ispccount=true;
            }else{
                System.out.println("enter an integer value..");
                scanner.nextLine();
            }
        }
               return new PcLab(labname,labaname,labiname,pcs);
    }

    private Pc addPc(Scanner scanner){
        clearScreen();
        System.out.println("enter pc ram:");
        String ram = scanner.nextLine();
        System.out.println("enter pc hdd:");
        String hdd = scanner.nextLine();
        System.out.println("enter processor:");
        String processor = scanner.nextLine();
        System.out.println("enter company name:");
        String companyname = scanner.nextLine();
        System.out.println("has gpu?:");
        boolean hasgpu = scanner.nextBoolean();
        scanner.nextLine();
        return new Pc(ram,hdd,processor,companyname,hasgpu);
    }

}
