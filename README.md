# Test Technique - Développeur Java Spring Junior

## Contexte du projet

Bienvenue dans ce test technique pour un poste de développeur Java Spring. Le projet consiste à compléter et
améliorer une application de commerce électronique simple. Vous aurez à ajouter des tests unitaires et d'intégration,
documenter les API existantes avec Swagger, et corriger des bugs.

## Structure du projet

L'application est une simple application Spring Boot avec une base de données PostgreSQL. Deux API de base sont déjà
implémentées :

- **Product API**
    - `GET /api/products` : Récupère tous les produits.
    - `POST /api/products` : Ajoute un nouveau produit.
- **Order API**
    - `GET /api/orders` : Récupère toutes les commandes.
    - `POST /api/orders` : Passe une nouvelle commande.

## Instructions pour le candidat

### Tâches à réaliser

Vous êtes libre de modifier le code à votre guise, juste pour bien l'expliquer et le documenter.

- Ajouter des tests unitaires pour les services et les contrôleurs existants.
- Ajouter des tests d'intégration pour les endpoints.
- Ajouter la documentation Swagger pour les API existantes.
- Corrigez tous les bugs potentiels que vous constatez :
    - exemple dans l'endpoint `POST /api/orders` : il ne vérifie pas si le produit commandé existe avant de créer la
      commande.
    - Les NPE.
    - Les exceptions.
- Ajouter les annotations de validation sur les objets api (ie: champs obligatoire, validation technique, ...)
- Utiliser un outil de versioning de model de données type liquibase ou autre
- Ajouter d'autres valeurs à l'enum Category (évolution du modèle de données)
- Ajoute une feature de la liste suivantes:
  - Gestion des avis sur les produits par les utilisateurs.
  - Panier d'achat.
  - D'autre fonctionalités que tu veux.

### Questions à compléter

- Expliquez comment vous avez implémenté les tests unitaires et d'intégration.
- Décrivez le processus de correction du bug.

## Configuration du projet

### Prérequis

- Java 21 ou supérieur
- Maven ou Gradle
- PostgreSQL

### Cloner le dépôt

```bash
git clone https://github.com/demo.git
cd demo
```

### Docker

Un fichier docker compose est fourni pour lancer et initialiser la base de données postgres

