package structural.proxy;

public class ProxyStudentClient {

    public static void main(String[] args) {
        ProxyStudent proxyStudent = new ProxyStudent();
        System.out.println("Proxy student giving attendance on behalf: " + proxyStudent.getName());
    }
}
