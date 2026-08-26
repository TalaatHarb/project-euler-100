use crate::Solvable;

fn sieve(n: usize) -> Vec<usize> {
    let mut not_prime = vec![false; n];
    let mut p = 2;
    while p * p < n {
        if !not_prime[p] {
            let mut i = p * 2;
            while i < n { not_prime[i] = true; i += p; }
        }
        p += 1;
    }
    not_prime[0] = true;
    not_prime[1] = true;
    (0..n).filter(|&i| !not_prime[i]).collect()
}

pub struct P010;
impl Solvable for P010 {
    fn problem_name(&self) -> &str { "p010" }
    fn solve(&self) -> i64 {
        sieve(2_000_000).iter().map(|&p| p as i64).sum()
    }
}

pub fn sieve_of_eratosthenes(n: usize) -> Vec<usize> {
    sieve(n)
}
