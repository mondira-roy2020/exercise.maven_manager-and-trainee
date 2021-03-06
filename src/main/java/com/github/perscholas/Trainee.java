package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
public class Trainee extends AbstractEmployee {
    // TODO - Ensure that each of the arguments passed through the constructor are assigned to a respective instance variable
    private Long id;
    private String name;
    private String address;
    private Long phoneNumber;
    private Double basicSalary;
    private Double specialAllowance;
    private Double hra;

    public Trainee(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
        super(id, name, address, phoneNumber, basicSalary,250.80,1000.50);
            }

    public Trainee() {
      super(null,null,null,null,null,250.80,1000.50);
    }

    @Override
    public void calculateSalary() {
        Double Salary = super.calculateTransportAllowance() + this.getBasicSalary();
        System.out.println("Salary of Trainee is =" + Salary);
    }

}