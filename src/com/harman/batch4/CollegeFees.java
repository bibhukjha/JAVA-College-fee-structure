package com.harman.batch4;

abstract class College {
    abstract void setAcademicFee();
}
class CS_depa extends College{
    @Override
    void setAcademicFee() {
        System.out.println("Fee is 100000");
    }

}
class ME_depa extends College{
    @Override
    void setAcademicFee() {
        System.out.println("Fee is 75000");
    }
}

class CollegeOffice{
    public static void main(String[] args) {
        College ob_cse=new CS_depa();
                College ob_me=new ME_depa();
        System.out.println("CSE Dept fee structure: ");
        ob_cse.setAcademicFee();
        System.out.println("ME Dept fee structure is: ");
        ob_me.setAcademicFee();
    }
}