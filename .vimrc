""alias vimc="vim -u /Users/stewart/current_semester/CIS_225/.vimrc"

:echo "! Loading .vimrc from"
:echo "! /Users/stewart/current_semester/CIS_225/"
:echo "! If this is undesired behavior, check $HOME/.bash_aliases"

:augroup tex
:au tex BufNewFile *.tex 0r /Users/stewart/current_semester/CIS_225/text/skeleton.tex
:au tex BufNewFile,BufRead *.tex setlocal textwidth=72 noexpandtab tabstop=8 shiftwidth=8 
:augroup END

:augroup java
:au java BufNewFile *.java 0r /Users/stewart/current_semester/CIS_225/src/skeleton.java
:au java BufNewFile,BufRead *java setlocal textwidth=72 expandtab shiftwidth=4 tabstop=4
:augroup END

:augroup gv
:au gv BufNewFile *.gv 0r /Users/stewart/current_semester/CIS_225/gvt/skeleton.gv
:au gv BufNewFile,BufRead *.gv setlocal gvtwidth=72 noexpandtab tabstop=8 shiftwidth=8 
:augroup END

:so ~/.vim/vimrc
