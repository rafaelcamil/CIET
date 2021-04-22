package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Então;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import screens.HomeScreen;
import screens.ResultScreen;
import screens.SearchScreen;

public class SearchCIeT {
    WebDriver driver;
    HomeScreen home;
    SearchScreen search;
    ResultScreen result;
/*
    @Before
    public void starUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafae\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @After
    public void tearDown() {
        driver.quit();
    }

    @Dado("^que navego para a página de busca do banco de questões \"([^\"]*)\"$")
    public void que_navego_para_a_página_de_busca_do_banco_de_questões(String option) throws Throwable {
        home = new HomeScreen(driver);
        home.goHome();
        home.navigateToSearch();
        search = new SearchScreen(driver);
        search.selectOption(option);
    }

    @Dado("^digito \"([^\"]*)\" no campo de busca$")
    public void digito_no_campo_de_busca(String key) throws Throwable {

        search.sendKeys(key);

    }

    @Quando("^clico no botão de buscar$")
    public void clico_no_botão_de_buscar() throws Throwable {
        search.searchText();
    }

    @Então("^visualizo uma mensagem de erro com o texto \"([^\"]*)\"$")
    public void visualizo_uma_mensagem_de_erro_com_o_texto(String message) throws Throwable {
        result = new ResultScreen(driver);
        result.viewResult(message);
    }

    @Então("^listagem de questões deve ter (\\d+) itens$")
    public void listagemDeQuestõesDeveTerItens(int itens) {
        result = new ResultScreen(driver);
        result.listCount(itens);
    }

    @E("^exibe controle de paginação\\.$")
    public void exibeControleDePaginação() {
        result.viewPageControl();
    }*/
}
