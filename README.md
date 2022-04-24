# Observabilidade - Prometheus e Grafana

Curso de observabilidade da Alura utilizando Prometheus e Grafana. A aplicação a ser monitorada é um Spring Boot.

<div align="center"><img src="./files/arquitetura-curso.png" width="450px"/></div>

## Tecnologias

- Prometheus
- Grafana
- Spring Boot
- Docker
- [Micrometer](https://micrometer.io/docs)
- [Spring Metrics](https://docs.spring.io/spring-metrics/docs/current/public/prometheus)

## Anotações

- Adicionando configurações do actuator

``` xml
# actuator
management.endpoint.health.show-details=always
management.endpoints.web.exposure.include=health,info,metrics
```

- Endpoints do actuator
    - [GET] [/actuator/health](http://localhost:8080/actuator/health)
    - [GET] [/actuator/metrics](http://localhost:8080/actuator/metrics)
    - [GET] [/actuator/prometheus](http://localhost:8080/actuator/prometheus)

- É possível adicionar métricas personalizadas com ``io.micrometer.core.instrument``

## Referência

- [Observabilidade: coletando métricas de uma aplicação com Prometheus](https://cursos.alura.com.br/course/observabilidade-prometheus)

---
Desenvolvido por [Jean Jacques Barros](https://github.com/jjeanjacques10)