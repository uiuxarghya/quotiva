# 🪶 Quotiva

**Quotiva** is a minimal Spring Boot + Thymeleaf web app that displays a random inspirational quote every time you visit or interact with the page.

> "Beautiful, simple, and blazing fast."

## ✨ Features

- 🔁 Random quotes from a local JSON file
- ⚡ Tailwind CSS-powered clean UI
- 💡 "Get Another Quote" button updates the quote instantly.
- 🔒 No external API or database needed
- ☕ Built entirely with Spring Boot and Thymeleaf

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+

### Running Locally

```bash
git clone https://github.com/yourusername/quotiva.git
cd quotiva

./mvnw spring-boot:run
```

Open your browser at [http://localhost:8080](http://localhost:8080)

## 🛠 Technologies Used

- Spring Boot
- Thymeleaf
- Tailwind CSS (via CDN)
- JSON (for quotes)

## 📁 Data Format

All quotes are stored locally in `src/main/resources/data/quotes.json`.

```json
[
  {
    "text": "The best way to predict the future is to invent it.",
    "author": "Alan Kay"
  },
  {
    "text": "Stay hungry, stay foolish.",
    "author": "Steve Jobs"
  }
]
```

## 🤝 Contributing

Feel free to fork the repo and submit pull requests. For feature ideas or bugs, open an issue.

## 📜 License

This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.

## 👤 Author

**Arghya Ghosh**  
[🌐 arghya.dev](https://arghya.dev) • [GitHub](https://github.com/uiuxarghya) • [LinkedIn](https://linkedin.com/in/uiuxarghya)

> “Words have the power to inspire. Quotiva delivers them, one at a time.”
