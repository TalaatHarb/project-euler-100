FROM golang:alpine as golang
WORKDIR /usr/src/app
COPY . .
RUN go build

FROM alpine
COPY --from=golang /usr/src/app/project-euler project-euler
CMD ["./project-euler"]
