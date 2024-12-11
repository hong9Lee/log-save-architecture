rootProject.name = "log-save-architecture"

include("apps:application:log-api")
include("apps:application:log-consumer")

include("apps:domain:log-core")

include("apps:infra:log-kafka")
include("apps:infra:log-persistence")

