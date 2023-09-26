// package dev.edy.demApp.datasource;

// import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.boot.jdbc.DataSourceBuilder;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// public class PostgresDatasource {
    
//     @Bean
//     @ConfigurationProperties("app.datasource")
//     public HikariDataSource hikariDataSource() {
//         return DataSourceBuilder
//                 .create()
//                 .type(HikariDataSource.class)
//                 .build();
//     }

//     Then in the file application YML add the following
//     app:
//         datasource:
//             jdbc-url: jdbc:postgresql://localhost:5432/demodb
//             username: postgres
//             password: password
//             pool-size: 30
// }

/*Ademas de esto debemos crear dos carpeta en el folder resources 
una llamada db y dentro de esta una llamada migration
dentro de esta ultima creamos un archivo llamado V1__PersonTable.sql 
dentro del archivo escribimos el siguiente query de SQL
CREATE TABLE person (
    id UUID NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);*/