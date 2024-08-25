public class TestArray {

    public int empId;
    public String empName;
    public float empSalary;

    TestArray(int empId, String empName, float empSalary){
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public static void main(String arg[]){
        TestArray[] empDetails = new TestArray[3];
        empDetails[0] = new TestArray(1001,"sneha",180000);
        empDetails[1] = new TestArray(1002,"alex",120000);
        empDetails[2] = new TestArray(1003,"erika",150000);

        for(int i=0; i<empDetails.length; i++){
            System.out.println(empDetails[i].empId+":"+empDetails[i].empName+":"+empDetails[i].empSalary);
        }
    }
}
