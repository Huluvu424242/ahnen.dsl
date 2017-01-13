# ahnen.dsl
Die Definition der DSL Ahnen - Einsatzgebiet Generalogie.

[![Build Status](https://travis-ci.org/FunThomas424242/ahnen.dsl.svg?branch=master)](https://travis-ci.org/FunThomas424242/ahnen.dsl)
[![codecov](https://codecov.io/gh/FunThomas424242/ahnen.dsl/branch/master/graph/badge.svg)](https://codecov.io/gh/FunThomas424242/ahnen.dsl)

## Developer Info

### Version erhöhen
```
mvn tycho-versions:set-version -DnewVersion=0.0.13-SNAPSHOT
```

### Release bauen

```shell
# start the ssh-agent in the background
>eval "$(ssh-agent -s)"
Agent pid 59566

>ssh-add

>mvn -B unleash:perform-tycho

# kill the agent
>ssh-agent -k
```

## Nützliche Quellen

* http://xtextcasts.org/episodes/11-custom-terminals
* https://sewiki.iai.uni-bonn.de/teaching/lectures/atsc/2013/assignment_09
* http://henrik-eclipse.blogspot.de/2010/05/implementing-date-support-with-quickfix.html
* https://chilifreak.wordpress.com/category/xtext/
* https://github.com/travis-ci/travis-ci/issues/4178#issuecomment-119321586 (Installation Java 9 für Whiteboxtest interner Klassen aus Testprojekt heraus)

## Analyse zum gramps.xml Format

[Question at stackexhange](http://genealogy.stackexchange.com/questions/12366/is-there-a-semantic-description-of-gramps-data-xml)
[Beispiel XML](https://github.com/gramps-project/gramps/blob/master/example/gramps/data.gramps)

### Familie

* Eine Familie besteht aus Vater, Mutter und eine Liste der Kinder. 
  Sie entspricht vom Konzept einer Beziehung.
* Der father Eintrag zeigt auf einen Person@handle welcher die Vater Rolle in
  der Familie übernimmt.
  Bei dieser Person wird entsprechend der parentin Eintrag auf die Familie gesetzt.
* Der mother Eintrag zeigt auf einen Person@handle welcher die Mutter Rolle in 
  der Familie übernimmt.
  Bei dieser Person wird entsprechend der parentin Eintrag auf die Familie gesetzt.
* Der childref Eintrag zeigt auf einen Person@handle welcher eine Kind Rolle in 
  der Familie übernimmt.
  Bei dieser Person wird entsprechend der childof Eintrag auf die Familie gesetzt. 
* Der childref Eintrag kann im mrel und frel Attribut folgende Werte besitzen:
  (None|Birth|Adopted|Stepchild|Sponsored|Foster|Other|Unknown)
  Vermutlich steht mrel für Söhne und frel für Töchter.

  
### People

* Das home Attribut zeigt auf ein Person@handle. Diese Person stellt den Ausgangspunkt
  für Reports und Navigation dar.

  
### Person

* Gültiges Werte für gender sind: M, F, U für male, female, unknown
* childof zeigt auf eine Familie in der die Person ein Kind darstellt.
* parentin zeigt auf eine Familie in der die Person ein Elternteil darstellt. 
