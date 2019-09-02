package teste;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class app {

	public static void editarTarefa(AndroidDriver driver, int k) {
		Scanner ler = new Scanner(System.in);
		int w = 0;
		(new TouchAction(driver)).tap(626, 1232).perform();
		System.out.println("criar tarefa");
		(new TouchAction(driver)).tap(62, 237).perform();
		MobileElement el1 = (MobileElement) driver
				.findElementById("com.example.android.architecture.blueprints.todomvp.mock:id/add_task_title");
		el1.click();
		el1.sendKeys("Tarefa " + k);
		System.out.println("criar descrição");
		MobileElement el2 = (MobileElement) driver
				.findElementById("com.example.android.architecture.blueprints.todomvp.mock:id/add_task_description");
		el2.click();
		MobileElement el3 = (MobileElement) driver
				.findElementById("com.example.android.architecture.blueprints.todomvp.mock:id/add_task_description");
		el3.click();
		el3.sendKeys("Descrição do desempenho MVP");
		(new TouchAction(driver)).tap(626, 783).perform();
		System.out.println("Registrar");
		String aux="";
		aux = JOptionPane
				.showInputDialog("Digite um número para editar tarefa");
		//System.out.println("começar a deletar digite 1");
		w = Integer.valueOf(aux);
		//System.out.println("começar a editar digite um número");
		//w = ler.nextInt();
		(new TouchAction(driver)).tap(204, 343).perform();
		MobileElement el4 = (MobileElement) driver
				.findElementById("com.example.android.architecture.blueprints.todomvp.mock:id/task_detail_complete");
		el4.click();
		(new TouchAction(driver)).tap(626, 1280).perform();
		MobileElement el5 = (MobileElement) driver
				.findElementById("com.example.android.architecture.blueprints.todomvp.mock:id/add_task_title");
		el5.click();
		(new TouchAction(driver)).tap(160, 245).perform();
		el5.sendKeys(""+w);
		(new TouchAction(driver)).tap(270, 346).perform();
		MobileElement el6 = (MobileElement) driver
				.findElementById("com.example.android.architecture.blueprints.todomvp.mock:id/add_task_description");
		el6.click();
		el6.sendKeys("sdsadsada");
		(new TouchAction(driver)).tap(626, 777).perform();

	}

	public static void deletarTarefa(AndroidDriver driver, int k) {
		Scanner ler = new Scanner(System.in);
		int w = 0;
		(new TouchAction(driver)).tap(626, 1232).perform();
		System.out.println("criar tarefa");
		(new TouchAction(driver)).tap(62, 237).perform();
		MobileElement el1 = (MobileElement) driver
				.findElementById("com.example.android.architecture.blueprints.todomvp.mock:id/add_task_title");
		el1.click();
		el1.sendKeys("Tarefa " + k);
		System.out.println("criar descrição");
		MobileElement el2 = (MobileElement) driver
				.findElementById("com.example.android.architecture.blueprints.todomvp.mock:id/add_task_description");
		el2.click();
		MobileElement el3 = (MobileElement) driver
				.findElementById("com.example.android.architecture.blueprints.todomvp.mock:id/add_task_description");
		el3.click();
		el3.sendKeys("Descrição do desempenho MVP");
		(new TouchAction(driver)).tap(626, 783).perform();
		System.out.println("Registrar");
		String aux="";
		aux = JOptionPane
				.showInputDialog("Digite um número para deletar tarefa");
		//System.out.println("começar a deletar digite 1");
		w = Integer.valueOf(aux);
		(new TouchAction(driver)).tap(220, 343).perform();
		MobileElement el4 = (MobileElement) driver
				.findElementById("com.example.android.architecture.blueprints.todomvp.mock:id/task_detail_complete");
		el4.click();
		MobileElement el5 = (MobileElement) driver
				.findElementById("com.example.android.architecture.blueprints.todomvp.mock:id/menu_delete");
		el5.click();

	}

	public static void criarTarefa(AndroidDriver driver, int k) {

		(new TouchAction(driver)).tap(626, 1232).perform();
		System.out.println("criar tarefa");
		(new TouchAction(driver)).tap(62, 237).perform();
		MobileElement el1 = (MobileElement) driver
				.findElementById("com.example.android.architecture.blueprints.todomvp.mock:id/add_task_title");
		el1.click();
		el1.sendKeys("Tarefa " + k);
		System.out.println("criar descrição");
		MobileElement el2 = (MobileElement) driver
				.findElementById("com.example.android.architecture.blueprints.todomvp.mock:id/add_task_description");
		el2.click();
		MobileElement el3 = (MobileElement) driver
				.findElementById("com.example.android.architecture.blueprints.todomvp.mock:id/add_task_description");
		el3.click();
		el3.sendKeys("Descrição do desempenho MVP");
		(new TouchAction(driver)).tap(626, 783).perform();
		System.out.println("Registrar");

		/*
		 * (new TouchAction(driver)).tap(626, 1283).perform(); MobileElement el1 =
		 * (MobileElement) driver .findElementById(
		 * "com.example.android.architecture.blueprints.todomvp.mock:id/add_task_title")
		 * ; el1.click(); el1.sendKeys("Tarefa " + k); (new
		 * TouchAction(driver)).tap(629, 792).perform();
		 */

	}

	public static void main(String[] args) throws MalformedURLException {

		// }
		// @Test
		// public void deveAdicionar() throws MalformedURLException {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("deviceName", "0047593311");
		desiredCapabilities.setCapability("platformName", "android");
		desiredCapabilities.setCapability("appPackage", "com.example.android.architecture.blueprints.todomvp.mock");
		desiredCapabilities.setCapability("appActivity",
				"com.example.android.architecture.blueprints.todoapp.tasks.TasksActivity");
		desiredCapabilities.setCapability("automationName", "UiAutomator2");
		desiredCapabilities.setCapability("noReset", true);
		desiredCapabilities.setCapability("eventTimings", true);

		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),
				desiredCapabilities);
		Scanner ler = new Scanner(System.in);
		int n = 0;
		String opcao = "0";
		String aux = "";
		int opcao2;
		opcao = JOptionPane.showInputDialog("Digite 1 para criar tarefa\n" + "Digite 2 para criar a tarefa e deletar\n"
				+ "Digite 3 para criar tarefa e editar tarefa");
		opcao2 = Integer.valueOf(opcao);
		// System.out.println("Digite 1 para criar tarefa | Digite 2 para criar a tarefa
		// e deletar");
		// opcao = ler.nextInt();

		switch (opcao2) {
		case 1:
			while (n != -1) {
				aux = JOptionPane
						.showInputDialog("esperando um digito para incrementar a tarefa\n" + "digite -1 para fechar");
				n = Integer.valueOf(aux);

				// System.out.printf("esperando um digito para fazer a tarefa,digite -1 para " +
				// "finalizar:\n");
				// n = ler.nextInt();
				criarTarefa(driver, n);
			}
			if (n == -1) {
				driver.quit();
			}
			break;
		case 2:
			while (n != -1) {
				aux = JOptionPane
						.showInputDialog("Esperando um digito para incrementar a tarefa\n" + "digite -1 para fechar");
				n = Integer.valueOf(aux);
				// System.out.printf("esperando um digito para fazer a tarefa,digite -1 para " +
				// "finalizar:\n");
				// n = ler.nextInt();
				deletarTarefa(driver, n);
			}
			if (n == -1) {
				driver.quit();
			}
			break;
		case 3:
			while (n != -1) {
				aux = JOptionPane
						.showInputDialog("Esperando um digito para incrementar a tarefa\n" + "digite -1 para fechar");
				n = Integer.valueOf(aux);
				// System.out.printf("esperando um digito para fazer a tarefa,digite -1 para " +
				// "finalizar:\n");
				// n = ler.nextInt();
				editarTarefa(driver, n);
			}
			if (n == -1) {
				driver.quit();
			}
			break;

		default:
			System.out.println("Não é um comando");
		}

	}

}
