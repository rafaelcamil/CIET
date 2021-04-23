package step_definitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import screens.HomeScreen;
import screens.ResultScreen;
import screens.SearchScreen;
import support.ConfigFileReader;

import java.util.concurrent.TimeUnit;

public class SearchSteps {
    WebDriver driver;
    HomeScreen home;
    SearchScreen search;
    ResultScreen result;
    ConfigFileReader reader;

    @Before
    public void starUp() {
        reader = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver",reader.getDriverPath());

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(reader.getImplicitlyWait(), TimeUnit.SECONDS);

        search = new SearchScreen(driver);
        result = new ResultScreen(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Dado("^que navego para a página de busca do banco de dados$")
    public void queNavegoParaAPáginaDeBuscaDoBancoDeDados() {
        home = new HomeScreen(driver);
        home.goHome();
        home.navigateToSearch();

    }

    @E("^seleciono a opção \"([^\"]*)\"$")
    public void selecionoAOpçãoOption(String option) {
        search.selectOption(option);
    }

    @E("^digito \"([^\"]*)\" no campo de busca$")
    public void digitoNoCampoDeBusca(String key) throws Throwable {
        search.sendKeys(key);
    }

    @Quando("^clico no botão de buscar$")
    public void clicoNoBotãoDeBuscar() {
        search.searchText();
    }

    @Então("^visualizo uma mensagem de erro com o texto \"([^\"]*)\"$")
    public void visualizoUmaMensagemDeErroComOTexto(String message) throws Throwable {
        result.messageVerify(message);
    }

    @Então("^listagem deve retornar resultados\\.$")
    public void listagemDeveRetornarResultados() {
        result.viewResult();
    }

    @Então("^listagem de questões deve ter (\\d+) itens$")
    public void listagemDeQuestõesDeveTerItens(int itens) {
        result.listCount(itens);
    }

    @E("^exibe controle de paginação\\.$")
    public void exibeControleDePaginação() {
        result.viewPageControl();
    }

    @Quando("^clico no botão de avançar do controle de paginação$")
    public void clicoNoBotãoDeAvançarDoControleDePaginação() {
        search.nextPage();
    }

    @Então("^avança para a página \"([^\"]*)\"$")
    public void avançaParaAPágina(String page) throws Throwable {
        search.pageVerify(page);
    }

    @Quando("^clico no nome do usuário$")
    public void clicoNoNomeDoUsuário() {
        search.clickUser();
    }

    @Então("^abre página do perfil do usuário$")
    public void abrePáginaDoPerfilDoUsuário() {
        search.profileVerify();
    }
}
