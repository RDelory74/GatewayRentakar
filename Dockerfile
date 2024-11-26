# Utiliser une image de base avec Java
FROM openjdk:17-jdk-slim

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Copier le fichier JAR de votre application dans le conteneur
COPY target/Gateway-0.0.1-SNAPSHOT.jar app.jar

# Exposer le port sur lequel votre application écoutera
EXPOSE 8080

# Démarrer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]