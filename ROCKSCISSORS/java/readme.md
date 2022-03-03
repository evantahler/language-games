Source: https://github.com/coding-horror/basic-computer-games

# JAVA

## Install

1. `brew install jenv` # install a java version manager
2. `brew install java` # install open jdk
3. Add the following to your .zshrc to load them (just like with nvm)

```
export PATH="$HOME/.jenv/bin:$PATH"
eval "$(jenv init -)"
```

4. `source ~/.zshrc`
5. `jenv add /opt/homebrew/opt/openjdk`
6. In this directory do `jenv local 17`

Don't forget to install the VSCode language pack for intellisense!

## Running

Java is a compiled language and could compile your code to run, especially if there is more than one file involved.

```bash
# From within the /java folder of this project
javac RockScissors.java
```

Or, you can run it without compilation

```bash
java RockScissors.java
```

Learn more: https://stackoverflow.com/questions/55794907/cant-find-mainstring-method-in-class-tapedeck-the-main-method-is-in-the-o

## Notes

1. Filename MUST match class names
2. Very OOO
3. `main()` is special. Any class with a main() method will be run
4. You need `;`
5. Classes in the same package are auto-imported
