use crate::{Runable, Solvable};
use crate::solutions::p010::sieve_of_eratosthenes;

fn number_of_divisors(mut n: usize, primes: &[usize]) -> usize {
    for &p in primes {
        if p == n { return 2; }
        if p > n { break; }
    }
    let mut result = 1;
    for &p in primes {
        let mut num = 0;
        while n % p == 0 { num += 1; n /= p; }
        if num > 0 { result *= num + 1; }
        if p > n { break; }
    }
    result
}

pub struct P012;
impl Solvable for P012 {
    fn problem_name(&self) -> &str { "p012" }
    fn solve(&self) -> i64 {
        let primes = sieve_of_eratosthenes(100_000);
        let target = 500;
        let mut i = 1usize;
        loop {
            let tn = i * (i + 1) / 2;
            if number_of_divisors(tn, &primes) > target {
                return tn as i64;
            }
            i += 1;
        }
    }
}
impl Runable for P012 {}
