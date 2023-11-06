@authentification
Feature: Je souhaite vérifier la page de connexion
 En tant que utilisateur je souhaite vérifier la page de connexion

  @authentification-valid
  Scenario: Je souhaite vérifier la page de connexion
  Given Je meconnecte sur l application Nopecommerce
  When je saisis l email "admin@youstor.com"
  And  je saisi le mot de passe "admin"
  And  Je clique sur le bouton Log In
  Then je me redirige vers la page Home
  
  
 