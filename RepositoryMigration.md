the following is a quick brain.dump of mine - **please edit & comment recklessly** without asking. In case it's all versioned. Still.

# Goals #

the following may not all be of equal importance, nor in be in any order:

  1. keep history (code)
  1. keep authorship per line a.k.a. blame/praise (code)
  1. keep history (website)
  1. keep authorship per line a.k.a. blame/praise (website)
  1. clean up author names (e.g. I used at least 3 different ones during the years) `$ svn log --xml http://piccolo2d.googlecode.com/svn/ | grep author | sort -u | perl -pe 's/.*>(.*?)<.*/$1 = /'`
  1. keep & update wiki pages
  1. keep open issues
  1. keep closed issues
  1. keep issue-revision relations
  1. split into per-language repositories
  1. other tweaks as in http://git-scm.com/book/en/v2/Git-and-Other-Systems-Migrating-to-Git#Subversion

# Hosting #

ranging from

  1. hosted (until hoster shuts down) (e.g. github, bitbucket, source forge, etc.)
  1. hosted with option to move to self-hosting (e.g. [gitlab](http://gitlab.org))
  1. self hosted ([fossil](http://fossil-scm.org/), gitlab, gitorious, ?)

# SCM #

  1. git
  1. mercurial
  1. [fossil](http://fossil-scm.org/)
  1. ?

## Mirrors (Unofficial) ##

  1. https://github.com/mro the following keep history, but drop issues. Naively via `$ git svn clone http://piccolo2d.googlecode.com/svn/<repo>/ -s`
    1. https://github.com/mro/piccolo2d.site
    1. https://github.com/mro/piccolo2d.java
    1. https://github.com/mro/piccolo2d.net
    1. https://github.com/mro/pocketpiccolo2d.net
  1. https://github.com/search?utf8=%E2%9C%93&q=piccolo2d

## Discussion ##

I'm confused, there's already a piccolo2d organizational account?

https://github.com/piccolo2d

> **@mro** yes, I'm also confused - don't know who's created that, see https://github.com/piccolo2d/piccolo2d.java/issues/1.

My most important concern is that contributions make it across the migration; specifically that user ids from Google Code match up with user ids in Github.  It looks to me like that didn't work for the migration that resulted in this repo

https://github.com/piccolo2d/piccolo2d.java

> **@mro** ids usually won't match out-of-the-box, so we'll ask/spy round which github ids to use and map them once finally migrating. (see 'clean up author names' above)