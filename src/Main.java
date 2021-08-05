import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userNameInDb="Olcay", passwordInDb="1234567890", userName, password, passwordResetSelection, newPassword;

        System.out.print("Kullanıcı Adı\t:");
        userName = input.nextLine();

        System.out.print("Parola\t:");
        password = input.nextLine();

        if (userName.equals(userNameInDb)) {
            if (password.equals(passwordInDb)) {
                System.out.println("Kullanıcı Adı ve Parola Doğru!\nGiriş Yapılıyor...");
            } else {
                System.out.print("Parola Yanlış!!!\nParolayı Değiştirmek İçin 1 Tuşuna Basınız. Çıkmak İçin 2'ye Basın:");
                passwordResetSelection = input.nextLine();
                if (passwordResetSelection.equals("1")) {
                    System.out.println("Yeni Parolanızı Giriniz: ");
                    newPassword = input.nextLine();
                    if (newPassword.equals(passwordInDb)) {
                        System.out.println("Yeni Parolanız En Son Parolanız İle Aynı Olamaz!");
                    } else {
                        System.out.println("Yeni Parolanız Kaydedilmiştir.");
                    }
                } else if (passwordResetSelection.equals("2")) {
                    System.out.println("Çıkış Yapılıyor...");
                }
            }
        }
        else {
            System.out.println("Kullanıcı Adınız Yanlış!!!");
        }
        }
    }