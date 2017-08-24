# clojure-101

Getting started with Clojure.

## Development Enviroment

### Install Leiningen

#### Method I

Follow instructions from [https://leiningen.org/](https://leiningen.org/)

### Method II

```bash
$ brew install leiningen
```

### Install VIM

Assuming that [Brew](https://brew.sh/) is installed.

```bash
$ brew update
$ brew install vim
$ brew install macvim
$ brew link macvim
```

### Install VIM Plugins

Install [pathogen.vim](https://github.com/tpope/vim-pathogen) or [Vundle.vim](https://github.com/VundleVim/Vundle.vim) or some other which you favor.

#### Recomended plugins

- [vim-clojure-static](https://github.com/guns/vim-clojure-static)
- [vim-fireplace](https://github.com/tpope/vim-fireplace)
- [vim-rainbow-parentheses](https://github.com/kien/rainbow_parentheses.vim)
- [vim-sensible](https://github.com/tpope/vim-sensible)
- [vim-clojure-highlight](https://github.com/guns/vim-clojure-highlight)
- [vim-salve](https://github.com/tpope/vim-salve) 
- [vim-test](https://github.com/janko-m/vim-test)

## Some VIM settings which I find good

There is lots of vim configurations and like with any editor everybody has their own preferences. [Exmple Amix vimrc](https://github.com/amix/vimrc).

There are from my ~/.vimrc

```vim
" Softtabs, 2 spaces
set tabstop=2
set shiftwidth=2
set shiftround
set expandtab

" Share the clipboard outside of macvim
set clipboard=unnamed

" Auto format any pasted text
nnoremap P P=`]
nnoremap p p=`]

" don't use vim backup files
set nobackup
set nowritebackup

" autorefresh changes from FS
set autoread

" Look and feel
set ruler               " set ruler
set number              " add line numbers
"set colorcolumn=80      " add line marker at 80 characters

" Mappings and shortcuts
"make jj do esc"
inoremap jj <Esc>

" use space as leader key
let mapleader = "\<Space>"

" Clojure write and require with one command
command! WriteAndRequire w|Require
map <leader>w :WriteAndRequire<CR>

" Searching and indexing
" Ignore case when searching
set ignorecase

" When searching try to be smart about cases
set smartcase

" Highlight search results
set hlsearch

" Windows, buffers & navigation
" Switch between the last two files
nnoremap <leader><leader> <c-^>
```

## Let's start

```bash
$ git clone git://github.com/functional-koans/clojure-koans.git
$ cd clojure-koans
$ lein koan run
$ vim src/koans/01_equalities.clj

```

## Links

[Clojure API Cheatsheet](https://clojure.org/api/cheatsheet)

## License

Copyright © 2017 Lab Of New

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
