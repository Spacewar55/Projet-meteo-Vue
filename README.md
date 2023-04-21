## Faire tourner l'application
* Navigate to `app/src/main/java/com/example/myapplication/MessagingOptions.kt` and update the following constants based on your broker's connection details:
  * `SOLACE_MQTT_HOST`
  * `SOLACE_CLIENT_PASSWORD`
* Modifier le `TOPIC` pour publish/subscribe le message souhaité dans `MainActivity.kt`
* Build et run l'application
  * L'application possède 3 champs : le topic pour subscribe, le topic pour publish et le message à publish. Si on utilise un topic pour subscribe, il est possible d'utiliser le même topic pour publish un message. A chaque fois qu'une information est récupérée du broker, un callback dans l'application permet d'augmenter la partie "Message reçu"
