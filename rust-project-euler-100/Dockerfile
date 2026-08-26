FROM rust:alpine AS builder
WORKDIR /usr/src/app
COPY . .
RUN cargo build --release

FROM alpine
COPY --from=builder /usr/src/app/target/release/rust-project-euler-100 rust-project-euler-100
CMD ["./rust-project-euler-100"]
