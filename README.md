# gemini-experiment 🤖

> Spring Boot + Google Gemini API — one evening curiosity build

## What It Does
Single endpoint — send a question, get an AI response back.
`GET /ask?question=What is Spring Boot`

## Tech Stack
Java 17 + Spring Boot + RestTemplate + Gemini 2.5 Flash API

## Setup
1. Get free API key from aistudio.google.com
2. Copy `application.properties.example` → `application.properties`
3. Add: `gemini.api.key=YOUR_KEY`
4. Run: `./mvnw spring-boot:run`
5. Test: `localhost:8080/ask?question=Hello`

## Why I Built This
Wanted to understand how LLM APIs work before adding AI features
to WorkNest V2. Part of my small evening builds series.

## GitHub
github.com/Sanjay-Ramesh/gemini-experiment
