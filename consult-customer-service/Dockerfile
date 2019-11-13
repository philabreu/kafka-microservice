##################################### CONFIGURAR ARQUIVO PRÓPRIO ##############################

FROM tomcat:9.0.1-jre8
ENV CATALINA_OPTS="$CATALINA_OPTS -Duser.timezone=America/Sao_Paulo -Xms512m -Xmx2048m -XX:+UseParallelGC"
ADD ./target/*.war $CATALINA_HOME/webapps/
ADD ./target/context.xml $CATALINA_HOME/webapps/manager/META-INF/context.xml
ADD ./target/context.xml $CATALINA_HOME/webapps/host-manager/META-INF/context.xml
EXPOSE 8080
CMD echo "000.000.000.000 hitbra.completo on" >> /etc/hosts; catalina.sh run;