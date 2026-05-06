public class enhanced_for_loop {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Adil";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Uzma";
        s2.marks = 95;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Adnan";
        s3.marks = 75;

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        //for loop :
//        for(int i=0;i<students.length;i++)
//		{
//			System.out.println(students[i].name+":"+students[i].marks);
//		}
        //for each/enhanced for loop :
            for(Student stud: students)
            {
                System.out.println(stud.name +":"+stud.marks);
            }

//        int nums[] = new int[4];
//        nums[0] = 4;
//        nums[1] = 8;
//        nums[2] = 3;
//        nums[3] = 9;
        //for loop
//        for (int i=0;i<nums/length;i++)
//		{
//			System.out.println(nums[i]);
//		}
        // for each/enhanced for loop
//        for(int n : nums){
//            System.out.println(n);
//        }

    }
}
