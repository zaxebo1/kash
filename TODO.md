## TODO 

- [ ] Background processes:
    - [X] `&`
    - [ ] `bg`
    - [ ] `fg`
    - [ ] `ps`
- [ ] Completer for all the scripts found in `scriptPath`
- [ ] Support for `#!` (Windows)
- [ ] Classpath configuration in `~/.kash.json`
- [ ] Aliases
- [ ] Allow Kotlin code in pipes
- [ ] `||` operator
- [ ] Return code `$#`
- [ ] Import management
- [ ] Exit
 

## DONE

- [X] Allow shell output to be processed in Kotlin, e.g. os("ls")
- [X] Grouping commands within parentheses
- [X] Enable / turn off debug logging from the shell
- [X] Completion of directories should take into account if the cursor is on a directory, e.g. "ls ~/<tab>"
- [X] Redirect stderr `2>`
- [X] File completion that follows the current directory
- [X] Home directory `~`
