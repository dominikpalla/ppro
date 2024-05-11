# KIKM/PPRO: Pokročilé programování – cvičení

Koncept cvičení uvažuje od začátku až do konce projít proces vývoje a produkce aplikace.
Jednotlivá cvičení odpovídají jednotlivým větvím na GitHubu:

#### 1.	cvičení: Úvod do předmětu, JakartaEE vs Spring
obecné informace k předmětu, JakartaEE projekt (Servlet, JSP), Spring a Spring Boot, Spring Initializr, Controller, výstupem Spring Boot Hello World projekt

#### 2.	cvičení: Spring Web
architektura MVC, HTTP metody, routování, Thymeleaf, Hot Reload, @PathVariable, @RequestParam, @RequestBody, formuláře pro CRUD operace, výstupem jednoduchá evidence aut se základními CRUD operacemi (bez persistence)

#### 3.	cvičení: Inversion of Controll
simulace IoC mechanismu v rámci jednoduchého Java SE projektu, metody injekce uvnitř Springu (kontruktorová, setterová a nedoporučená fieldová), vrstvení Spring aplikace, výstupem služba pro manipulaci s modelem Auto

#### 4.	cvičení: Rozšíření projektu
rozšíříme naší aplikaci o další modelové třídy, služby a uživatelská rozhraní

#### 5.	cvičení: Persistence
napojení aplikace na H2 embedded databázi, IntelliJ IDEA DB tool, ORM, DAO princip, vrstvení Spring aplikací, Repository, výstupem rozšíření aplikace o persistenční vrstvu

#### 6.	cvičení: Pokročilá persistence
pokročilé metody mapování (OneToOne, OneToMany, ManyToMany), výstupem komplexnější aplikace s persistenční vrstvou, rozšíření modelové stránky aplikace

#### 7.	cvičení: REST API
využití API 3. strany (světové počasí) a napojení funkcionality do naší aplikace, seznámení se s knihovnou OkHttp3

#### 8.	cvičení: Vlastní REST API
vytvoření vlastní REST služby pro manipulaci s modelem naší aplikace (CRUD), výstupem i jednoduchá Java SE aplikace, která bude modelem externě manipulovat

#### 9.	cvičení: Aspektově Orientované Programování (AOP), Spring Security
rozšíříme aplikaci o komplexní logování za použití mechanismu AOP, vysvětlení, doplníme přihlašování uživatelů a security vrstvu

#### 10.	cvičení: Kontejnerizace pomocí Dockeru
vyměníme embedded H2 databázi za MariaDB běžící v prostředí Dockeru, rozjedeme naši aplikaci rovněž v Dockeru a propojíme s MariaDB databází

#### 11.	cvičení: Produkce v cloudu (MS Azure)
zaregistrujeme se školním účtem do portálu MS Azure a zkusíme svou aplikaci nahrát do produkce v rámci Spring Apps modulu
