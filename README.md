# Swag-Labs-Feudal-Overlords

## **Table Of Contents**
* [**Overview**](#overview)
* [**Project Planning (Agile - Scrum)**](#project-planning)
    - [Sprint 02/03](#sprint-02/03)
    - [Sprint 03/03](#sprint-03/03)
    - [Sprint 04/03](#sprint-04/03)
    - [User Stories](#user-stories)
* [**Tools and Dependencies**](#tools-and-dependencies)
    - [IntelliJ](#intellij)
    - [Maven](#maven)
    - [JUnit Jupiter API](#junit-jupiter-api)
    - [Cucumber Java](#cucumber-java)
    - [Cucumber JUnit](#cucumber-junit)
    - [Selenium Java](#selenium-java)
    - [Mandatory Local Tools](#mandatory-local-tools)
* [**Page Object Model Classes**](#page-object-model-classes)
* [**Behaviour-driven Development Tests**](#behaviour-driven-development-tests)
    - [Feature Files](#feature-files)
    - [Step Definitions](#step-definitions)
    - [Runners](#runners)
* [**Driver Factory Class**](#driver-factory-class)
    - [Configuration Properties](#configuration-properties)
* [**Assumptions**](#assumptions)
* [**Recommendations**](#recommendations)
* [**How to use the project**](#how-to-use-the-project)

### **Overview**

In this project, we created a testing framework for https://www.saucedemo.com/ website.

<br/>
<div align="left">
    <b><a href="#table-of-contents">↥ Back to top</a></b>
</div>
<br/>

### **Project Planning**

In this project, Agile methodology implemented. Scrum methodology was used. Sprint planning, daily stand-up and retrospective meetings were hold. They helped to have well-structured plan and good communication across the team. There were 3 sprints throughout the project. Project was tracked using Trello board. 

<br/>
<div align="left">
    <b><a href="#table-of-contents">↥ Back to top</a></b>
</div>
<br/>

#### **Sprint 02/03**

In first sprint, we planned the project based on testing perspective and decided to the parts that need to be tested. Page Object Model classes (POM) were created for each page. Test scenarios were written in Gherkin language according to the user stories. Factory driver class was created to make sure that all testing done in the same browser by the help of Singleton pattern. 

![image-sprint-02/03](https://i.imgur.com/BoAtTeF.png?1)

<br/>
<div align="left">
    <b><a href="#table-of-contents">↥ Back to top</a></b>
</div>
<br/>

#### **Sprint 03/03**

In second sprint, POM classes and Gherkin statements were completed. Apart from locating web elements in POM classes, some reusable methods were also added to these classes to make the use of framework easier. Factory Driver was also updated with different browser options. We searched which options we have for cucumber options, and we created runner class to run test scenarios with particular options.

![image-sprint-03/03](https://i.imgur.com/BvgX6V9.png)

<br/>
<div align="left">
    <b><a href="#table-of-contents">↥ Back to top</a></b>
</div>
<br/>

#### **Sprint 04/03**

In third sprint, Gherkin statements were implemented by creating step definitions classes. New reusable methods were also added to POM classes. Finally, slides were prepared to present our project to the rest.

<br/>
<div align="left">
    <b><a href="#table-of-contents">↥ Back to top</a></b>
</div>
<br/>

#### **User Stories**

We have 3 epics in this project. These were regarding login, checkout, and inventory functionalities. These were split to different user stories. Acceptance criteria also was created for each user story, and these were used to create test scenarios which were happy and unhappy. 

<br/>
<div align="left">
    <b><a href="#table-of-contents">↥ Back to top</a></b>
</div>
<br/>

### **Tools and Dependencies**

We used different tools and dependencies in this project.

<br/>
<div align="left">
    <b><a href="#table-of-contents">↥ Back to top</a></b>
</div>
<br/>

#### **IntelliJ**

Intellij is an integrated development environment (IDE) written in Java for developing computer software.  

<br/>
<div align="left">
    <b><a href="#table-of-contents">↥ Back to top</a></b>
</div>
<br/>

#### **Maven**

Maven is a build automation tool used primarily for Java projects. It has different lifecycles and plugins that you can configure your project.

<br/>
<div align="left">
    <b><a href="#table-of-contents">↥ Back to top</a></b>
</div>
<br/>

#### **JUnit Jupiter API**

JUnit Jupiter is a dependency that can be used in unit testing for the Java programming language. We used it to test our driver factory. Also, assertions were used to assert test object.

<br/>
<div align="left">
    <b><a href="#table-of-contents">↥ Back to top</a></b>
</div>
<br/>

#### **Cucumber Java**

In this project, we used Cucumber Java dependency to be able to implement our test scenarios written in Gherking langugage using Given, When, Then annotations. 

<br/>
<div align="left">
    <b><a href="#table-of-contents">↥ Back to top</a></b>
</div>
<br/>

#### **Cucumber JUnit**

In this project, we used Cucumber JUnit dependency for Cucumber options. So, we can configure our testing.

<br/>
<div align="left">
    <b><a href="#table-of-contents">↥ Back to top</a></b>
</div>
<br/>

#### **Selenium Java**

Selenium Java is a dependency that we can automate Web Browser by providing Web Driver. It was also used to select the Web Elements. 

<br/>
<div align="left">
    <b><a href="#table-of-contents">↥ Back to top</a></b>
</div>
<br/>

#### **Mandatory Local Tools**

To be able to use this framework with 3 different browsers, we need to add 3 different exe files under resources folder which is under test folder. These are chromedriver, geckodriver for Firefox and msedgedriver.

![image-browser](https://i.imgur.com/Wo2MkyJ.png)

<br/>
<div align="left">
    <b><a href="#table-of-contents">↥ Back to top</a></b>
</div>
<br/>