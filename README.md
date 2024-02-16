# Crick-Informer 
This project provides a simple Java application to fetch live cricket match updates from a website and store them in a database. The application uses Jsoup for web scraping and a scheduled task to continuously update the match data.

## Features
- Scrapes live cricket match data from a website
- Stores match information in a database
- Updates match data at regular intervals

## Requirements 
- Java 8 or Higher
- Maven for building the Project
- Angular for Frontend
- Postman to check endpoints
## Configuration
Edit the application.properties file to configure the database connection and other settings:
### Database configuration
- `spring.datasource.url=jdbc:mysql://localhost:3306/live_matches`
- `spring.datasource.username=root`
- `spring.datasource.password=password`
- `spring.jpa.hibernate.ddl-auto=update`

### Scheduled task interval in minutes
`update.interval=1`


## Usage
The application will start fetching live match updates and storing them in the database. You can access the live match data from the database using your preferred database management tool or application.

## Contributing
Contributions are welcome! Please feel free to submit a pull request or open an issue if you encounter any problems or have suggestions for improvement.










# Front-end Angular

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 17.1.3.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.
