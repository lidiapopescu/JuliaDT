# References

## Related Projects

1. [dltk.javascript](https://github.com/eclipse/dltk.javascript)
2. [dltk.ruby](https://github.com/eclipse/dltk.ruby)
3. [Build an Eclipse development environment for Perl, Python, and PHP](http://www.ibm.com/developerworks/opensource/tutorials/os-eclipse-octave/)

## tycho

1. [tycho reference](https://wiki.eclipse.org/Tycho/Target_Platform)
2. [tycho/jboss](https://github.com/jbosstools/jbosstools-maven-plugins)
3. [examples](https://github.com/bluezio/examples-eclipse-tycho)
4. [demo](https://github.com/jsievers/tycho-demo/tree/master/tychodemo.bundle)
5. [packaging](http://wiki.eclipse.org/Tycho/Packaging_Types#eclipse-plugin)


## Background

1. [DLTK wiki](https://wiki.eclipse.org/DLTK)
2. [declarative services](http://www.vogella.com/tutorials/OSGiServices/article.html#tutorial_ds)


## Dependencies
1. [DLTK plugins](https://download.eclipse.org/technology/dltk/updates-dev/6.0m3/)

2. org.antlr.antlr4-runtime-osgi;bundle-version="4.5.1" - can not find
- Used from alpha release returns issues in debug
..\com.juliacomputing.jldt.eclipse.parser\lib\org.antlr.antlr4-runtime-osgi_4.5.1.1.jar
Used (org.antlr.antlr4-runtime-osgi) from java sources
(antlr/antlr4)[https://github.com/antlr/antlr4]
(antlr4 latest release - 4.9.2)[https://github.com/antlr/antlr4/releases]

(ANTLR 4)[https://www.antlr.org/download]
(ANTLR4 IDE Eclipse Plugin for ANTLR 4)[https://www.antlr.org/tools.html]

3. (Junit4 -is part of Eclipse Java Development Tools (JDT).)[https://github.com/junit-team/junit4/wiki/Download-and-Install]
(JUnit eclipse plugin)[https://stackoverflow.com/questions/1962567/junit-eclipse-plugin]

4. (Guava: Google Core Libraries for Java)[https://github.com/google/guava]
(Guava latest release -30.1.1)[https://github.com/google/guava/releases]

## Summary
The feature uses:
- org.antlr.v4.runtime from https://github.com/antlr/antlr4/tree/master/runtime/Java
- org.eclipse.equinox.util from
https://git.eclipse.org/r/equinox/rt.equinox.bundles.git

## TODO
- Latest Guava (guava-30.1.1-jre.jar)[https://github.com/google/guava/releases] is not applicable, api has been changed and test code needs to be recreated

