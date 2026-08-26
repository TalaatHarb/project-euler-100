# project-euler-100

Comprehensive solutions to the first 100 problems from [Project Euler](https://projecteuler.net/), implemented in multiple programming languages with consistent patterns, tests, and best practices.

## Project Goals

- 🎯 Practice algorithms and data structures
- 🚀 Learn new programming languages and paradigms
- 📊 Compare syntax, performance, and design patterns across languages
- ✅ Maintain best practices for project structuring and testing in different ecosystems
- 🤝 Demonstrate collaboration and professional git workflows using [Gitflow](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow)

## Running Solutions

### Language Implementations

This project includes solutions in **7 programming languages**:

- **Python** - Fast prototyping and clean algorithm implementations
- **Java** - Enterprise-scale with Maven build system
- **TypeScript** - Type-safe JavaScript solutions with npm tooling
- **Go** - Efficient, compiled implementations with goroutine support for parallel execution
- **C#** - Modern .NET implementations with comprehensive testing
- **Rust** - High-performance, memory-safe solutions

Each language folder follows the same structure and naming conventions (e.g., `p001.py`, `P001.java`, etc.), making it easy to compare implementations across languages.

### Python (`python-project-euler-100`)

**Requirements:** Python 3

**Run all solutions:**
```bash
cd python-project-euler-100
python AllSolutions.py
```

**Run in parallel:**
```bash
python AllSolutions.py -p
```

**Run specific problem:**
```bash
python p001.py
```

**Run tests:**
```bash
python -m unittest AllSolutionsTest.py -v
```

---

### Java (`java-project-euler-100`)

**Requirements:** JDK 17+ and Maven

**Build and run:**
```bash
cd java-project-euler-100
mvn clean install
java -jar target/java-project-euler-100-0.0.1-SNAPSHOT.jar
```

**Run in parallel:**
```bash
java -jar target/java-project-euler-100-0.0.1-SNAPSHOT.jar -p
```

**Run tests:**
```bash
mvn clean test
```

---

### TypeScript (`typescript-project-euler-100`)

**Requirements:** Node.js and npm

**Setup and run:**
```bash
cd typescript-project-euler-100
npm install
npm run build:run
```

**Run in parallel:**
```bash
npm run build:runParallel
```

**Run tests:**
```bash
npm run build:test
```

---

### Go (`go-project-euler-100`)

**Requirements:** Go runtime

**Build and run:**
```bash
cd go-project-euler-100
go build
./project-euler.exe
```

**Run tests:**
```bash
go test
```

---

### C# (`csharp-project-euler-100`)

**Requirements:** .NET 10 SDK

**Run:**
```bash
cd csharp-project-euler-100
dotnet run --project net.talaatharb.projecteuler100.Console/net.talaatharb.projecteuler100.Console.csproj
```

**Run tests:**
```bash
dotnet test net.talaatharb.projecteuler100.slnx
```

---

### Rust (`rust-project-euler-100`)

**Requirements:** Rust toolchain (rustc and cargo)

See the `rust-project-euler-100` directory for Rust-specific build and run instructions.

## CI/CD and Deployment

### Jenkins Integration

This project includes a `Jenkinsfile` configured for multi-branch pipeline support. To use Jenkins, ensure your instance has the following plugins installed and configured:

**Required Plugins:**
- git
- maven
- nodejs
- golang
- shiningpanda
- jacoco
- pipeline-maven
- pyenv-pipeline

**Required Runtime Environments:**
- Python 3 (with pip and virtualenv)
- JDK 17+ with Maven
- Node.js and npm
- Go runtime
- .NET SDK

### Docker

An alternative to installing all language runtimes is to use Docker. Each language folder includes a `Dockerfile` for containerized builds and execution.

**Quick start:**
```bash
cd <language-project-folder>
docker build -t project-euler-<language> .
docker run project-euler-<language>
```

**Benefits:**
- Single dependency: Docker engine only
- No version conflicts between language runtimes
- Consistent environment across different machines
- Isolated execution environments
