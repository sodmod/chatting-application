FROM fundingsocietiesdocker/openjdk19-alpine
LABEL authors="olusolabadmus"
ADD target/*jar chat-app.jar
ENTRYPOINT ["java", "-jar", "chat-app.jar"]