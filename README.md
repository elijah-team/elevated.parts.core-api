# elevated.parts.core-api

Annoy ourselves less (:eyes: jitpack)

Just throw some sheti up

```shell
[INFO] You have 18487 Checkstyle violations.
[INFO] Saved Build to local file: /Users/u6521/IdeaProjects/elevated.parts.core-api/build-cache/v1/tripleo.elijah/elevated-potential-core-api-xxx/9299b4fc83c627c1/local/buildinfo.xml
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for elevated.parts.core-api elevated-potential.l251121:
[INFO]
[INFO] elevated.parts.core-api ............................ SUCCESS [  0.382 s]
[INFO] elevated-potential.core.queues ..................... SUCCESS [  0.210 s]
[INFO] elevated-potential.s.g_l251121 ..................... SUCCESS [  0.065 s]
[INFO] elevated-potential.s.debugflags_l251121 ............ SUCCESS [  0.048 s]
[INFO] elevated-potential-core-api-xxx .................... SUCCESS [ 38.972 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  40.009 s
[INFO] Finished at: 2026-08-25T14:18:47-04:00
[INFO] ------------------------------------------------------------------------
```

```shell
git clone https://gitlab.com/elijah-team/api-components/cegont-upper
cd cegont-upper
../mvnw -Dmaven.repo.local=xyzzy install
cd ..
./mvnw clean verify
```

No ITs here. We want `package`, technically.
