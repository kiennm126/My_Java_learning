package B13.EntitiesManager;

import B13.Entities.*;
import B13.Exceptions.BirthdayException;
import B13.Exceptions.EmailException;
import B13.Exceptions.FullNameException;
import B13.Exceptions.PhoneException;
import B13.Entities.Certificate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UIManager {
    private EmployeeManager employeeManager;
    private Scanner scanner;

    public UIManager(Scanner scanner) {
        this.scanner = scanner;
        this.employeeManager = new EmployeeManager();
    }

    public void insertEmployee() {
        Employee employee = null;
        System.out.println("Adding employees...");

        System.out.print("Enter employee type (0: Experience, 1: Fresher, 2: Intern): ");
        int employeeType = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter employee ID: ");
        String employeeID = scanner.nextLine();

        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter birthdate (DD-MM-YYYY): ");
        String birthday = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.println("Enter certificates: ");
        List<Certificate> certificates = new ArrayList<>();
        System.out.print("Enter the number of certificates: ");
        int numOfCerti = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numOfCerti; i++){
            System.out.print("Enter certificate " + (i+1) + " ID: ");
            String certificateID = scanner.nextLine();
            System.out.print("Enter certificate " + (i+1) + " name: ");
            String certificateName = scanner.nextLine();
            System.out.print("Enter certificate " + (i+1) + " rank: ");
            String certificateRank = scanner.nextLine();
            System.out.print("Enter certificate " + (i+1) + " date: ");
            String certificateDate = scanner.nextLine();
            Certificate certificate = new Certificate(certificateID, certificateName, certificateRank, certificateDate);
            certificates.add(certificate);
        }

        if (employeeType == 0) {
            System.out.print("Enter years of experience: ");
            int expInYear = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter professional skill: ");
            String proSkill = scanner.nextLine();

            employee = new Experience(employeeID ,fullName, birthday, phone, email, certificates, expInYear, proSkill);
        } else if (employeeType == 1) {
            System.out.print("Enter graduation date (DD-MM-YYYY): ");
            String graDate = scanner.nextLine();

            System.out.print("Enter graduation rank: ");
            String graduationRank = scanner.nextLine();

            System.out.print("Enter education: ");
            String education = scanner.nextLine();

            employee = new Fresher(employeeID ,fullName, birthday, phone, email, certificates, graDate, graduationRank, education);
        } else if (employeeType == 2) {
            System.out.print("Enter current major: ");
            String currentMajor = scanner.nextLine();

            System.out.print("Enter semester: ");
            int semester = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter university name: ");
            String universityName = scanner.nextLine();

            employee = new Intern(employeeID, fullName, birthday, phone, email, certificates, currentMajor, semester, universityName);
        } else {
            System.out.println("Invalid employee type. Employee not added.");
            return;
        }

        try {
            checkData(employee);
            employeeManager.insert(employee);
            System.out.println("Employee added successfully.");
        } catch (BirthdayException | PhoneException | EmailException | FullNameException e) {
            System.out.println("Invalid employee data. " + e.getMessage() + " Employee not added.");
        }
    }

    private void checkData(Employee employee) throws BirthdayException, PhoneException, EmailException, FullNameException {
        Validator.birthdayCheck(employee.getBirthday());
        Validator.phoneCheck(employee.getPhoneNum());
        Validator.emailCheck(employee.geteMail());
        Validator.nameCheck(employee.getFullName());
    }

    public void deleteEmployee() {
        System.out.print("Enter the employee ID to delete: ");
        String employeeID = scanner.nextLine();

        boolean deleted = employeeManager.deleteById(employeeID);
        if (deleted) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found. Deletion failed.");
        }
    }

    public void searchByType() {
        System.out.print("Enter the employee type to search (0: Experience, 1: Fresher, 2: Intern): ");
        int employeeType = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<Employee> employees = employeeManager.findByType(employeeType);
        if (employees.isEmpty()) {
            System.out.println("No employees found for the given type.");
        } else {
            System.out.println("Employees of type " + employeeType + ":");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    public void editEmployee() {
        System.out.print("Enter the employee ID to edit: ");
        String employeeID = scanner.nextLine();

        Employee employee = employeeManager.findById(employeeID);
        if (employee == null) {
            System.out.println("Employee not found. Edit failed.");
            return;
        }

        System.out.println("Editing employee information:");
        System.out.println(employee);

        System.out.print("Enter full name (leave empty to keep current value: " + employee.getFullName() + "): ");
        String fullName = scanner.nextLine();
        if (!fullName.isEmpty()) {
            employee.setFullName(fullName);
        }

        System.out.print("Enter birthdate (DD-MM-YYYY) (leave empty to keep current value: " + employee.getBirthday() + "): ");
        String birthday = scanner.nextLine();
        if (!birthday.isEmpty()) {
            employee.setBirthday(birthday);
        }

        System.out.print("Enter phone number (leave empty to keep current value: " + employee.getPhoneNum() + "): ");
        String phone = scanner.nextLine();
        if (!phone.isEmpty()) {
            employee.setPhoneNum(phone);
        }

        System.out.print("Enter email (leave empty to keep current value: " + employee.geteMail() + "): ");
        String email = scanner.nextLine();
        if (!email.isEmpty()) {
            employee.seteMail(email);
        }

        if (employee instanceof Experience experience) {

            System.out.print("Enter years of experience (leave empty to keep current value: " + experience.getYearOfExperience() + "): ");
            String expInYearInput = scanner.nextLine();
            if (!expInYearInput.isEmpty()) {
                int expInYear = Integer.parseInt(expInYearInput);
                experience.setYearOfExperience(expInYear);
            }

            System.out.print("Enter professional skill (leave empty to keep current value: " + experience.getProSkill() + "): ");
            String proSkill = scanner.nextLine();
            if (!proSkill.isEmpty()) {
                experience.setProSkill(proSkill);
            }
        } else if (employee instanceof Fresher fresher) {

            System.out.print("Enter graduation date (DD-MM-YYYY) (leave empty to keep current value: " + fresher.getGraduationDate() + "): ");
            String graduationDate = scanner.nextLine();
            if (!graduationDate.isEmpty()) {
                fresher.setGraduationDate(graduationDate);
            }

            System.out.print("Enter graduation rank (leave empty to keep current value: " + fresher.getGraduationRank() + "): ");
            String graduationRank = scanner.nextLine();
            if (!graduationRank.isEmpty()) {
                fresher.setGraduationRank(graduationRank);
            }

            System.out.print("Enter education (leave empty to keep current value: " + fresher.getEducation() + "): ");
            String education = scanner.nextLine();
            if (!education.isEmpty()) {
                fresher.setEducation(education);
            }
        } else if (employee instanceof Intern intern) {

            System.out.print("Enter current major (leave empty to keep current value: " + intern.getMajor() + "): ");
            String currentMajor = scanner.nextLine();
            if (!currentMajor.isEmpty()) {
                intern.setMajor(currentMajor);
            }

            System.out.print("Enter semester (leave empty to keep current value: " + intern.getSemester() + "): ");
            String semesterInput = scanner.nextLine();
            if (!semesterInput.isEmpty()) {
                int semester = Integer.parseInt(semesterInput);
                intern.setSemester(semester);
            }

            System.out.print("Enter university name (leave empty to keep current value: " + intern.getUniversityName() + "): ");
            String universityName = scanner.nextLine();
            if (!universityName.isEmpty()) {
                intern.setUniversityName(universityName);
            }
        }

        System.out.println("Employee information updated successfully:");
        System.out.println(employee);
    }

    public void showAllEmployees() {
        List<Employee> employees = employeeManager.findAll();
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("All Employees:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    public void countEmployeeNumber() {
        long employeeCount = employeeManager.countEmployees();
        System.out.println("Total number of employees: " + employeeCount);
    }
}