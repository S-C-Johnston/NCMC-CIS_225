""alias vimc="vim -u /Users/stewart/current_semester/CIS_225/.vimrc"

:echo "Loading .vimrc from /Users/stewart/current_semester/CIS_225/"
:echo "If this is undesired behavior, check $HOME/.bash_aliases"

:augroup tex
:au tex BufNewFile *.tex 0r /Users/stewart/current_semester/CIS_225/skeleton.tex
:au tex BufNewFile,BufRead *.tex setlocal textwidth=72 noexpandtab tabstop=8 shiftwidth=8 
:augroup END

:augroup java
:au java BufNewFile *.java 0r /Users/stewart/current_semester/CIS_225/skeleton.java
:au java BufNewFile,BufRead *java setlocal textwidth=72 expandtab shiftwidth=4 tabstop=4
:augroup END

:augroup gv
:au gv BufNewFile *.gv 0r /Users/stewart/current_semester/CIS_225/skeleton.gv
:au gv BufNewFile,BufRead *.gv setlocal textwidth=72 noexpandtab tabstop=4 shiftwidth=4 filetype=dot
:augroup END

:so ~/.vim/vimrc
